<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/9 0009
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="viewport" content="initial-scale=1,user-scalable=no,maximum-scale=1,width=device-width">


    <style>body {
        padding-bottom: constant(safe-area-inset-bottom);
        padding-bottom: env(safe-area-inset-bottom);
    }</style>

    <link rel="stylesheet" href="css/jquery.dialogbox.css">
    <link rel="stylesheet" href="css/client-ui.css">
    <link rel="stylesheet" href="css/account-v2-client-css-a149ffaff9f04dfd3e8a.css">
    <style type="text/css" abt="234"></style>

    <style type="text/css">object, embed {
        -webkit-animation-duration: .001s;
        -webkit-animation-name: playerInserted;
        -ms-animation-duration: .001s;
        -ms-animation-name: playerInserted;
        -o-animation-duration: .001s;
        -o-animation-name: playerInserted;
        animation-duration: .001s;
        animation-name: playerInserted;
    }

    @-webkit-keyframes playerInserted {
        from {
            opacity: 0.99;
        }
        to {
            opacity: 1;
        }
    }

    @-ms-keyframes playerInserted {
        from {
            opacity: 0.99;
        }
        to {
            opacity: 1;
        }
    }

    @-o-keyframes playerInserted {
        from {
            opacity: 0.99;
        }
        to {
            opacity: 1;
        }
    }

    @keyframes playerInserted {
        from {
            opacity: 0.99;
        }
        to {
            opacity: 1;
        }
    }</style>
</head>
<body>
<div class="sb-nav">
    <div class="nav-top">
        <div class="container clearfix">
            <div class="nav-top-left">
                <ul>

                    <li><a class="secondary" href="#">首页</a></li>
                    <li><a class="secondary" href="#">单词</a></li>
                </ul>
            </div>
            <div class="nav-top-right">
                <ul>
                    <li class="nav-help-btn"><a href="#">帮助</a></li>
                </ul>
                <div class="nav-user"><a class="login-btn"
                                         href="/login.jsp">登录</a><span>·</span><a
                        class="register-btn" href="/register.jsp">注册</a></div>
            </div>
        </div>
    </div>
    <div class="nav-sub">
        <div class="container"></div>
    </div>
</div>
<div class="main-content container">
    <div class="login-client-page">
        <div class="login-wrap" style="
    /* text-align: center; */
"><h3>English</h3>
            <div class="login-form" name="login-form">
                <div class="row"><input class="name" id="input-account" type="text" placeholder="用户名 / 邮箱 / 手机号"
                                        name="account" autofocus=""><i class="ib ib-user-o"></i></div>
                <div class="row"><input class="password" id="input-password" type="password" placeholder="密码"
                                        name="password"><i class="ib ib-lock-o"></i></div>
                <div class="row"><input class="password" id="input-password-" type="password" placeholder="确认密码"
                                        name="password"><i class="ib ib-lock-o"></i></div>

                <div class="submit-btn-box">
                    <button class="button login-button" id="button-login" type="submit">注册</button>
                    <p class="error-msg"></p></div>
            </div>
        </div>
    </div>
</div>
<div id="stantard-dialogBox"></div>

<script src="js/jquery-1.12.4.min.js"></script>
<script src="js/jquery.dialogBox.js"></script>
<script>
    $("#button-login").click(function (e) {
        var username = $('#input-account').val();
        var password = $('#input-password').val();
        var password2 = $('#input-password-').val();

        var re = /^1\d{10}$/;

        if(!re.test(username)){
            alert("错误")
            return;
        }

        if (password != password2){
            $('#stantard-dialogBox').dialogBox({
                title: 'English',
                hasClose: true,
                content: '您两次输入的密码不一致！'
            });
            return;
        }
        $.ajax({
            url: '/user/register.do',
            type: 'post',
            data: {
                username: username,
                password: password
            },
            success: function (data) {
                console.log(data);
                if (data.status==0){
                    $('#stantard-dialogBox').dialogBox({
                        title: 'English',
                        hasClose: true,
                        content: '注册成功'
                    });
                    setTimeout(function () {
                        window.location.href="/login.jsp";
                    }, 2000);
                }else{
                    $('#stantard-dialogBox').dialogBox({
                        title: 'English',
                        hasClose: true,
                        content: data.msg
                    });
                }
            },
        });
    });

    $('.search-submited').click(function () {
        window.location.href = '/userword/searchwordDetail.do?word=' + $('.search-input').val()
    })
</script>
</body>
</html>
