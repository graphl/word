<%@ page import="com.word.pojo.User" %><%--
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
            <li class=""><a id="bdc-new-review-link" href="/study.jsp">单词学习</a></li>
            <li class=""><a href="/userword/show_UserWord.do">我的词库</a></li>
            <li class="active"><a href="#">单词设置</a></li>
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
    <div class="row">
        <div id="setting" class="span8">

            <div id="setting-bdc" class="setting">

                <div class="page-header">
                    <h3>背单词设置</h3>
                </div>


                <form action="/bdc/setting/" method="post">
                    <input type="hidden" name="csrfmiddlewaretoken" value="Mcqgva6946fzwOgCovf5ByiyYWgQ0c7G">
                    <table class="table">
                        <tbody>
                        <tr>
                            <th>
                                <label>
                                    正在学习：
                                </label>
                            </th>
                            <td>
                                <select  name="learn">
                                    <option value="1" selected="selected">考研单词书</option>
                                    <option value="2">四级单词</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th><label for="id_target_level">单词的目标掌握程度：</label></th>
                            <td><select id="id_target_level" name="target_level">
                                <option value="1" selected="selected">再认</option>
                                <option value="2">拼写</option>
                            </select></td>
                        </tr>
                        <tr>
                            <th><label for="id_target_retention">学习次数：</label></th>
                            <td>
                                <select  name="learn" id="id_target_retention">
                                    <option value="1" selected="selected">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th><label for="id_quota">每日学习量：</label></th>
                            <td><select id="id_quota" name="quota">
                                <option value="20">20</option>
                                <option value="50">50</option>
                                <option value="100">100</option>
                                <option value="150" selected="selected">150</option>
                                <option value="200">200</option>
                                <option value="250">250</option>
                                <option value="300">300</option>
                                <option value="400">400</option>
                                <option value="500">500</option>
                                <option value="600">600</option>
                                <option value="700">700</option>
                            </select></td>
                        </tr>
                        </tbody>
                    </table>

                    <button class="btn btn-success" type="submit">确定</button>
                    &nbsp;&nbsp;<a href="/" class="cancel">取消</a>

                </form>
            </div>

            <script id="cost_tip_tmpl" type="text/x-jquery-tmpl">
    <p>只要坚持登录，您每天都会收到 <span class="green">5</span> 个彩贝的奖励</p>
    <p>如果坚持完成学习后打卡，您每天还会再被额外奖励 <span class="green">${checkin_prize}</span> 个彩贝</p>
    <p>总之，只要你坚持学习，就能够积攒到足够的贝壳支付将来的学费，还有机会向更高的单词量迈进。</p>
    <p> <a href="/help/support_function/how_to_earn_coins/#invite-user" target="_blank">了解什么是贝壳，彩贝</a> </p>

            </script>

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
        $('.search-submited').click(function () {
            window.location.href = '/userword/searchwordDetail.do?word=' + $('.search-input').val()
        })
    })

    function onKnow() {
        if (flg) {
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
        if (flg) {
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