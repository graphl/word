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
        <div id="review1" class="span12 review">
            <div class="row bdc-learning-header">
                <div class="span12"><p><span class="span-left">⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅</span> 我的单词 <span class="span-right">⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅</span>
                </p></div>
            </div>
            <div class="hero-unit start-review new-start-review">
                <div class="row new-review-summary">
                    <div class="pull-left span7">
                        <h1 class="span2 today">150
                            <small>我的单词</small>
                        </h1>
                    </div>
                    <div class="span3">
                        <div class="row-fluid">
                            <button class="span12 btn-large btn-success start-review-button">开始学习</button>
                        </div>
                        <div class="row-fluid">
                            <div id="start-review-button-loading" class="hide"
                                 style="text-align: center; padding-top: 30px;"><img
                                    src="https://static.baydn.com/static/img/loading.gif" width="20"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div id="review2" class="span12 review" style="display: none;">
            <div class="row">
                <div class="span12 test-box review-id" data-id="61906001704">
                    <div id="preview" class="row">
                        <div class="span10">
                            <div class="row word-row new-word-row">
                                <div class="span10 offset1"><h1 id="word_name">carbon</h1>
                                    <div class="learning-speaker">
                                        <h1>
                                            <small id="word_symbol"> /'kɑːrbən/</small>
                                        </h1>
                                        <span class="audio us active">US<span class="speaker-icon"></span>
                                            <audio id="music"
                                                   src="https://media-audio1.baydn.com/us/a/as/assignment_v4.mp3"></audio></span>
                                    </div>
                                </div>
                            </div>

                            <div id="example-hint" class="row learning-hint learning-hint-active" style="display: none;">
                                <div class="span10 offset1">
                                    <div class="hint-content sentence annotation"> ocean-going</div>
                                </div>
                            </div>

                            <div class="row">
                                <div id="answer" class="span10 offset1 operation" style="opacity: 1;">
                                    <div class="row test-answers first"><a class="known span10"
                                                                           href="javascript:void(0)" onclick="onKnow()"><span>1. </span>认识</a>
                                    </div>
                                    <div class="row test-answers"><a class="unknown span10"
                                                                     href="javascript:void(0)" onclick="unKnow()"><span>2. </span>不认识</a>
                                    </div>
                                </div>
                            </div>
                        </div>
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

    var words;
    var cur;
    let m = document.getElementById('music');
    var flg = true;

    $(function () {

        $.ajax({
            url: '/userword/get_MWord.do',
            type: 'get',
            data: {},
            success: function (data) {
                words = data.data;
                $('.today').text(words.length);
                if (words.length > 0) {
                    cur = 0;
                    $('#word_name').html(words[cur].word_name);
                    $('#word_symbol').html(words[cur].word_symbol);
                    $('#music').attr('src', words[cur].word_sound);
                    $('.hint-content').text(words[cur].word);
                }
            },
        });

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
    })

    function onKnow() {
        if (flg){
            $.ajax({
                url: '/userword/Know_Word.do',
                type: 'get',
                data: {word_id: words[cur].id},
                success: function (data) {
                },
            });
        }
        flg = true;
        cur++;
        $('#word_name').html(words[cur].word_name);
        $('#word_symbol').html(words[cur].word_symbol);
        $('#music').attr('src', words[cur].word_sound);
        $('.hint-content').text(words[cur].word);
        $('#example-hint').hide();
    }

    function unKnow() {
        if (flg){
            flg = false;
            $('#example-hint').show();
            $.ajax({
                url: '/userword/unKnow_Word.do',
                type: 'get',
                data: {word_id: words[cur].id},
                success: function (data) {
                },
            });
        }
    }
</script>
</body>
</html>