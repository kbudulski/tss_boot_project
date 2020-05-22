let stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    } else {
        $("#conversation").hide();
    }
    $("#chat").html("");
}

function connect() {
    const socket = new SockJS('/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function () {
        setConnected(true);
        stompClient.subscribe('/topic/chat', function (message) {
            showMessage(JSON.parse(message.body));
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
}

function sendMessage() {
    stompClient.send("/app/chat", {}, JSON.stringify({'name': $("#name").val(), 'content': $("#message").val()}));
}

function showMessage(message) {
    $("#chat").append("<tr><td>" + message.name + ": " + message.content + " (" + message.time + ")" + "</td></tr>");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#connect").click(function () {
        connect();
    });
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendMessage();
    });
});