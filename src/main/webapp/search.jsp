<%@ page import="com.word.pojo.User" %>
<%@ page import="com.word.vo.WordDetailOneVo" %>
<%@ page import="java.util.List" %>
<%@ page import="com.word.pojo.Phrase" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page import="com.word.pojo.Sentence" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/9 0009
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
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
</head>

<body data-spy="scroll" data-target=".subnav" data-offset="50" class="">
<div id="hints-bundle-modal">
</div>

<!-- Navbar
  ================================================== -->
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

                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="#">
                            社区
                        </a>
                    </li>

                </ul>

                <ul class="nav nav-right pull-right" style="z-index: 1000">

                    <li><a href="#" class="shortcuts-button">快捷键</a></li>

                    <li class="dropdown main-nav nav-avatar  ">
                        <a href="#" class="main-menu user-avatar" data-toggle="dropdown"> <i> <img
                                src="https://media-image1.baydn.com/avatar_img%2Fcizbtc%2Fb5c11e19486a6c1def47c9345fb425a8.c7a2d9f8de1d9979a1ff579a396b3ea9.jpg@20w_20h"
                                width="20" height="20" class=""> </i>
                            <%=((User)session.getAttribute("currentUser")).getUsername()%>
                            <img class="dropdown-arraw" src="https://static.baydn.com/static//img/icon-arraw.png">
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
            <li class="active"><a id="bdc-new-review-link" href="/study.jsp">单词学习</a></li>
            <li class=""><a href="/userword/show_UserWord.do">我的词库</a></li>
            <li class=""><a href="/setting.jsp">单词设置</a></li>
        </ul>
    </div>




</div>
<div class="container main-body  new-main-body" style="min-height: 754px;">

    <div id="review-setting"></div>
    <div id="loading-spin" style="display: none;">
        <p style="text-align: center;margin-top: 5px;">正在加载数据 ...</p>
    </div>
    <div class="row divide-against-progress">
        <div id="review" class="span12">
            <div id="learning-box" class="review-id row">
                <div class="test-box span12 learning-detail-container">
                    <div class="alert alert-container">
                        <p class="add-word-hint">
                            <a href="javascript:;" id="add_to_userWord" vocab-id="<%=((WordDetailOneVo)request.getAttribute("wordDetail")).getId()%>">点击这里</a>
                            将这个单词添加到你的词库
                        </p>
                        <p class="word-added-hint hide">该单词已被成功添加进你的词库，页面将在2秒钟之后刷新</p>
                        <p class="add-word-failed-hint hide">添加单词失败，请稍后再试</p>
                    </div>

                    <div id="learning_word" class="row">
                        <div class="word span10">
                            <div class="row">
                                <div class="span1"><h6 class="pull-right">&nbsp;</h6></div>
                                <div class="span9">
                                    <h1 class="content pull-left" style=""><%=((WordDetailOneVo)request.getAttribute("wordDetail")).getWord_name()%>
                                        <small><%=((WordDetailOneVo)request.getAttribute("wordDetail")).getWord_symbol()%></small>
                                    </h1>

                                    <div class="pull-left learning-speaker">
                                        <span class="audio us">US<span
                                                class="speaker-icon"></span></span>
                                        <audio id="music"
                                               src="<%=((WordDetailOneVo)request.getAttribute("wordDetail")).getWord_sound()%>" />
                                    </div>

                                </div>
                            </div>
                            <div class="row">
                                <div class="span1">
                                    <h6 class="pull-right">
                                        单词解释
                                    </h6>
                                </div>
                                <div class="span9" id="review-definitions">
                                    <div class="well">
                                        <div class="row">

                                            <div class="cndf span7"><span class="text"><%=((WordDetailOneVo)request.getAttribute("wordDetail")).getWord()%></span>
                                            </div>

                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div  class="row" style="margin-top: 40px;">
                        <div class="span1">
                            <h6 class="pull-right">
                                例句
                            </h6>
                        </div>
                        <div class="span9">
                            <ul  class="nav nav-tabs">
                                <li class="active"><a class="ex-sys-box-tab" data-toggle="tab"
                                                      href="#ex-sys-box">金典例句</a></li>
                            </ul>
                            <div>
                                <div class="tab-pane row active">
                                    <ol class="span9">
                                        <%
                                            List<Sentence> sentenceList = ((WordDetailOneVo)request.getAttribute("wordDetail")).getSentence();
                                            for (int i=0; i<sentenceList.size(); i++) {
                                        %>
                                        <li class="row">
                                            <div class="span9">
                                                <%--<div class="index pull-left"><%=i+1%></div>--%>
                                                <div class="pull-left body">
                                                    <div class="annotation enex">
                                                        <%=sentenceList.get(i).getSentence()%>
                                                    </div>
                                                    <div class="cnex"> <%=sentenceList.get(i).getSentenceChinese()%></div>
                                                    <div class="edit-example-box">
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                        <%
                                            }
                                        %>
                                    </ol>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div id="spell-modal-box">
                    </div>
                </div>
            </div>
        </div>

    </div>
    <div class="row hide bottom-progress progress-box">
        <div class="span12 progress-box-wrap">
            <div class="row">
                <div class="span1">
                    <h6 class="pull-right">进度</h6>
                </div>
                <div class="span10">
                    <div class="well review-progress">
                        <div class="progress pull-right progress-danger" style="width:0%;">
                            <div class="bar" style="width: 100%"><span class="num"></span>
                            </div>
                        </div>
                        <div class="progress pull-left progress-success" style="width:0%;">
                            <div class="bar" style="width: 100%"><span class="num"></span></div>
                        </div>
                        <div class="progress pull-left progress-reviewed " style="width: 0%;">
                            <div class="bar reviewed pull-left" style="width: 100%;"><span class="num"></span>
                            </div>
                        </div>
                        <div class="progress pull-left progress-unreviewed" style="width: 99.9%;">
                            <div class="bar" style="width: 100%"><span class="num">150</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="affix-prompt">
    </div>


</div>
<script src="/js/jquery-1.12.4.min.js"></script>
<script>
    $(function () {
        $('.search-submited').click(function () {
            window.location.href = '/userword/searchwordDetail.do?word=' + $('.search-input').val()
        })
    })

    let m = document.getElementById('music');

    $('.speaker-icon').click(function () {
        m.load();//加载
        m.play();//播放
    })
</script>
</body>
</html>