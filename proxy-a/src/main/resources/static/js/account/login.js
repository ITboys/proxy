$(function () {

    // 注册新增按钮的事件
    $("#loginBtn").click(function () {
        $("#loginModalLabel").text("登录");
        $('#loginModal').modal();
    });

    // 登录
    $('#btn_submit').click(function () {
        var host = window.location.host;
        var username = $('#loginModal').find('input[name=username]').val();
        var password = $('#loginModal').find('input[name=password]').val();
        var loginRequest = {};
        loginRequest.userName = username;
        loginRequest.password = password;
        $.ajax({
            method: "POST",
            url: "http://" + host + "/login/",
            data: loginRequest,
            dataType: "json"
        }).success(function (result) {

        }).fail(function () {

        });
        alert(username + password);
    });
});