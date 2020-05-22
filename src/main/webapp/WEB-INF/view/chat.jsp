<%@include file="shared/navbar.jspf" %>
<%@include file="shared/header.jspf" %>

<noscript>
    <h2 style="color: #ff0000">Seems your browser doesn't support Javascript! Websocket relies on Javascript being
        enabled. Please enable
        Javascript and reload this page!</h2></noscript>

<div class="container" style="padding-top: 30px">
    <div class="row">
        <div class="col" style="display: flex; justify-content: center">
            <form class="form-inline">
                <div class="form-group">
                    <label for="name">What is your name?</label>
                    <input type="text" id="name" class="form-control" placeholder="Your name here...">
                </div>
                <button id="connect" class="btn btn-default" type="submit">Connect</button>
                <button id="disconnect" class="btn btn-default" type="submit" disabled="disabled">Disconnect
                </button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <form class="form-inline" style="width: 100%; justify-content: center">
                <div class="form-group" style="width: 40%">
                    <label for="message">Message</label>
                    <input type="text" id="message" class="form-control" placeholder="Your message here...">
                </div>
                <button id="send" class="btn btn-default" type="submit">Send</button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <table id="conversation" class="table table-striped" style="word-break: break-word">
                <thead>
                <tr>
                    <th>Welcome to the chat.</th>
                </tr>
                </thead>
                <tbody id="chat">
                </tbody>
            </table>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/sockjs-client/1.0.2/sockjs.min.js"></script>
<script src="${pageContext.request.contextPath}/webjars/stomp-websocket/2.3.3/stomp.min.js"></script>
<script src="${pageContext.request.contextPath}/static/app.js"></script>

<%@include file="shared/footer.jspf" %>