<%--
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


    <link href="css/shanbay-fontawesome-v3.css" rel="stylesheet" type="text/css">

    <link href="css/shanbay.1e7fb99f94a25299c81b5410a4ee007a.css" rel="stylesheet" type="text/css">
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

                    <li class="dropdown main-nav
    active
">
                        <a href="/bdc/client/guide" class="main-menu">
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
                            admin
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
            <li class="
    active
"><a id="bdc-new-review-link" href="#">单词学习</a></li>
            <li class=""><a href="#">我的词库</a></li>
            <li class=""><a href="#">单词设置</a></li>
        </ul>
    </div>

    <div class="sub-menu ">
        <ul class="container">
            <li class=""><a href="#">炼句学习</a></li>
            <li class=""><a href="#">课程</a></li>
            <li class=""><a href="#">炼句设置</a></li>
        </ul>
    </div>

    <div id="menu-news" class="sub-menu ">
        <ul class="container">
            <li class="">
                <a href="#">短文首页</a>
            </li>
            <li class="">
                <a href="#">收藏的短文</a>
            </li>
            <li class="">
                <a href="#">短文计划</a>
            </li>

            <li class="">
                <a href="#">短文进度</a>
            </li>

        </ul>
    </div>

    <div id="menu-books" class="sub-menu ">
        <ul class="container">
            <li class="">
                <a href="#">读书首页</a>
            </li>
            <li class="">
                <a href="#">短文计划</a>
            </li>

            <li class="">
                <a href="#">短文进度</a>
            </li>

        </ul>
    </div>


    <div class="sub-menu ">
        <ul class="container">
            <li class=""><a href="#">听力学习</a></li>
            <li class=""><a href="#">听力课程</a></li>
            <li class=""><a href="#">听力计划</a></li>
            <li class=""><a class="#" href="/listen/#buy-hints">购买提示</a></li>
            <li class=""><a href="#">听力设置</a></li>
        </ul>
    </div>

    <div class="sub-menu ">
        <ul class="container">
            <li class=""><a href="#">论坛</a></li>
            <li class=""><a href="#">小组</a></li>
            <li class=""><a href="#">精选</a></li>
        </ul>
    </div>


</div>


<!--
<div class="gradient-bar">
    &nbsp;
</div>
-->


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

                        <p class="add-word-hint"><a href="javascript:;" class="add-word-to-review"
                                                    vocab-id="2376">点击这里</a> 将这个单词添加到你的词库</p>
                        <p class="word-added-hint hide">该单词已被成功添加进你的词库，页面将在2秒钟之后刷新</p>
                        <p class="add-word-failed-hint hide">添加单词失败，请稍后再试</p>

                    </div>

                    <div id="learning_word" class="row">
                        <div class="word span10">
                            <div class="row">
                                <div class="span1"><h6 class="pull-right">&nbsp;</h6></div>
                                <div class="span9">
                                    <h1 class="content pull-left" style="">English
                                        <small>/'ɪŋɡlɪʃ/</small>
                                    </h1>

                                    <div class="pull-left learning-speaker">
                                        <span class="audio uk"
                                              data="https://media-audio1.baydn.com/uk%2Fe%2Fen%2Fenglish_v3.mp3">UK<span
                                                class="speaker-icon"></span></span>
                                        <span class="audio us"
                                              data="https://media-audio1.baydn.com/us%2Fe%2Fen%2Fenglish_v3.mp3">US<span
                                                class="speaker-icon"></span></span>
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

                                            <div class="cndf span7"><span class="text">n. 英语</span><span class="text">adj. 英格兰的； 英国的； 英语的； 英格兰人的</span>
                                            </div>

                                        </div>
                                        <div class="row">

                                            <div class="span1"><span class="part-of-speech label">n.</span></div>
                                            <ol class="span7">

                                                <li class="definition">
                                                    <span class="content">an Indo-European language belonging to the West Germanic branch; the official language of Britain and the United States and most of the commonwealth countries</span>
                                                </li>

                                            </ol>

                                            <div class="span1"><span class="part-of-speech label">adj.</span></div>
                                            <ol class="span7">

                                                <li class="definition">
                                                    <span class="content">of or relating to or characteristic of England or its culture or people</span>
                                                </li>

                                            </ol>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="learning-examples-box" class="row">
                        <div class="span1">
                            <h6 class="pull-right">
                                例句
                            </h6>
                        </div>
                        <div class="span9">
                            <ul id="example-tab" class="nav nav-tabs">
                                <li class="active"><a class="ex-sys-box-tab" data-toggle="tab"
                                                      href="#ex-sys-box">词典例句</a></li>
                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane row active" id="ex-sys-box">
                                    <ol class="span9">


                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">1</div>
                                                <div class="pull-left body">
                                                    <div class="annotation enex">

                                                        She speaks good English.

                                                    </div>
                                                    <div class="cnex">她英语说得很好。</div>
                                                    <div class="edit-example-box">
                                                    </div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">2</div>
                                                <div class="pull-left body">
                                                    <div class="annotation enex">

                                                        I need to improve my English.

                                                    </div>
                                                    <div class="cnex">我需要提高我的英语水平。</div>
                                                    <div class="edit-example-box">
                                                    </div>
                                                </div>
                                            </div>
                                        </li>


                                    </ol>
                                </div>
                                <div class="tab-pane row" id="ex-user-box">
                                    <ol class="span9">


                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">1</div>
                                                <div class="pull-left body">
                                                    <div class="annotation enex">

                                                        i love english very much,hope i can speak an good english very
                                                        soon.

                                                    </div>
                                                    <div class="cnex">我非常喜欢英语，希望很快能说流利的英语。</div>
                                                    <div class="edit-example-box">
                                                    </div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">2</div>
                                                <div class="pull-left body">
                                                    <div class="annotation enex">

                                                        What is English for "卷发"?

                                                    </div>
                                                    <div class="cnex">“卷发”用英文怎么说？</div>
                                                    <div class="edit-example-box">
                                                    </div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">3</div>
                                                <div class="pull-left body">
                                                    <div class="annotation enex">

                                                        English is so good

                                                    </div>
                                                    <div class="cnex">英文很好</div>
                                                    <div class="edit-example-box">
                                                    </div>
                                                </div>
                                            </div>
                                        </li>


                                    </ol>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="notes-box" class="row">
                        <div class="span1"><h6 class="pull-right">笔记</h6></div>
                        <div class="span9">
                            <ul id="note-tab" class="nav nav-tabs">
                                <li class="active"><a class="note-user-box-tab" href="#note-user-box">共享笔记</a></li>
                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane row active" id="note-user-box">
                                    <ol class="span9">


                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">1</div>
                                                <div class="pull-left content">
                                                    <span>The English countryside looks at it's best in spring.</span>
                                                    <div class="author">作者 <a href="/user/list/wechat_mbysitjz/"
                                                                              target="_blank">wechat_mbysitjz</a></div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">2</div>
                                                <div class="pull-left content">
                                                    <span>German French Italian American;
English 英语；</span>
                                                    <div class="author">作者 <a href="/user/list/Phenix9899/"
                                                                              target="_blank">Phenix9899</a></div>
                                                </div>
                                            </div>
                                        </li>

                                        <li class="row">
                                            <div class="span9">
                                                <div class="index pull-left">3</div>
                                                <div class="pull-left content">
                                                    <span>The English countryside looks at its best in spring. 英国的乡村在春天景色最美</span>
                                                    <div class="author">作者 <a href="/user/list/ziyuanqingdi/"
                                                                              target="_blank">ziyuanqingdi</a></div>
                                                </div>
                                            </div>
                                        </li>


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
<script src="js/jquery-1.12.4.min.js"></script>
<script>

</script>
</body>
</html>