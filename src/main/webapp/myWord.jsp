<%@ page import="com.word.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.word.vo.UserWordVo" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="robots" content="index,follow">
    <meta name="copyright" content="Copyright 2009-2019. www.shanbay.com . All Rights Reserved.">
    <meta name="viewport" content="initial-scale=1,user-scalable=no,maximum-scale=1,width=device-width">

    <title>记单词</title>

    <link href="/css/shanbay-fontawesome-v3.css" rel="stylesheet" type="text/css">

    <link href="/css/shanbay.1e7fb99f94a25299c81b5410a4ee007a.css" rel="stylesheet" type="text/css">

    <link href="/css/library.33c719b0fc9b076506fc01b97073fb97.css" rel="stylesheet" type="text/css">

    <style>
        .span8 {
            width: 920px;
        }
    </style>
</head>

<body data-spy="scroll" data-target=".subnav" data-offset="50" class="">
<div id="hints-bundle-modal">
</div>
<div id="main-navbar" class="navbar navbar-fixed-top ">
    <div class="navbar-inner" style="filter: none">
        <div class="container">

            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="nav-collapse">
                <ul class="nav" style="z-index: 1040">
                    <li class="dropdown main-nav home ">
                        <a class="main-menu" href="#">首页</a>
                    </li>
                    <li class="dropdown main-nav active">
                        <a href="#" class="main-menu">
                            单词
                        </a>
                    </li>
<%--
                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="#">
                            社区
                        </a>
                    </li>--%>

                </ul>

                <ul class="nav nav-right pull-right" style="z-index: 1000">

                 <%--   <li><a href="#" class="shortcuts-button">快捷键</a></li>--%>

                    <li class="dropdown main-nav nav-avatar  ">
                        <a href="#" class="main-menu user-avatar" data-toggle="dropdown"> <i> <img
                                src="https://media-image1.baydn.com/avatar_img%2Fcizbtc%2Fb5c11e19486a6c1def47c9345fb425a8.c7a2d9f8de1d9979a1ff579a396b3ea9.jpg@20w_20h"
                                width="20" height="20" class=""> </i>
                            <%=((User) session.getAttribute("currentUser")).getUsername()%>
                            <%--<img class="dropdown-arraw" src="https://static.baydn.com/static//img/icon-arraw.png">--%>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="sb-nav-menu-a" href="#">设置</a></li>

                            <li><a class="sb-nav-menu-a" href="#">退出</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-search pull-right" action="">
                    <div class="controls">
                        <div class="input-prepend">
                            <input type="text" class="search-input span2" placeholder="查词" style="height: 30px;">
                            <img src="https://static.baydn.com/static/img/icon-remove.png" class="icon-remove hide">
                            <span class="add-on search-submited"><i class="icon-search"></i></span>
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>

    <div class="sub-menu
    active">
        <ul class="container" style="height: 47px;">
            <li class=""><a id="bdc-new-review-link" href="/study.jsp">单词学习</a></li>
            <li class="active"><a href="#">我的词库</a></li>
            <li class=""><a href="/setting.jsp">单词设置</a></li>
        </ul>
    </div>
</div>
<div class="container main-body  new-main-body" style="min-height: 754px;">

    <div id="review-setting"></div>
    <div style="display: none;">
        <p style="text-align: center;margin-top: 5px;">正在加载数据 ...</p>
    </div>
    <div class="row">
        <div id="learnings-library" class="span8">

            <div id="learnings-container">
                <div class="hide" id="today" style="display: block;">
                    <%
                        List<UserWordVo> userWordVoList = (List<UserWordVo>)request.getAttribute("userWords");
                        for (UserWordVo item : userWordVoList) {
                    %>
                    <div class="learning">
                        <div class="wordinfo" style="margin-top: 20px;"><span class="word"
                                                                                                     style="width: 30%; display: block; float:left;"><%=item.getWord_name()%></span>
                            <span style="width: 20%;display: block; float: left;">                 <span
                                    class="pronunciation" style="display:block; float: left;"><%=item.getWord_symbol()%></span>                 <span
                                    class="speaker" style="display: block; float: left; cursor: pointer;">                      <i
                                    class="icon-volume-off" style="font-size:20px; color:#d3d3d3"></i>                 </span>                 </span>
                            <span class="definition" style="width: 30%; display: block; float: left;"><%=item.getWord()%></span> <span class="operations" style="width:10%; display: block; float:left;">             <p
                                    class="msg success hide">操作成功</p>             <p class="delete-confirm well hide">                 <span
                                    class="confirm">确认删除</span>             </p>             <span class="view" title="查看">
                                <a href="/userword/searchwordDetail.do?word=<%=item.getWord_name()%>">
                                    <span class="icon icon-small" style="margin-right: -15px;">
                                    <img src="https://static.baydn.com/static/img/package/eye.png">
                                    </span>
                                </a>
                            </span>
                                <span class="setmaster master" title="删除" id="deleteWord">
                                    <span class="icon icon-small"><img src="https://static.baydn.com/static/img/package/rubish.png" onclick="deleteUserWord(<%=item.getId()%>)" ></span>
                            </span>
                            </span>
                            <br style="clear:both;height:0;"></div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
            <div id="loading-spin" style="padding-top: 20px;"></div>
            <span class="hide" id="library-type" user_id="108966250"></span>


        </div>

    </div>
    <div id="affix-prompt">
    </div>


</div>
<script src="/js/jquery-1.12.4.min.js"></script>
<script>
    var words;
    var cur;
    let m = document.getElementById('music');
    var flg = true;

        $('.speaker-icon').click(function () {
            m.load();//加载
            m.play();//播放
        })
        $('.start-review-button').click(function () {

            if (words.length > 0) {
                $('#review1').hide();
                $('#review2').show();
            }

        })



    function deleteUserWord(wordId)
    {
        alert("delete"+wordId)


        $.ajax({
            url:'/userword/delete_UserWord.do'
            ,type:'post'
            ,data:{wordId:wordId}
            ,success:function (res) {
                alert('成功')

            }
            ,error:function (res) {
                alert("失败")
            }
        })
    }

    $('.search-submited').click(function () {
        window.location.href = '/userword/searchwordDetail.do?word=' + $('.search-input').val()
    })
</script>
</body>
</html>