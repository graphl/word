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
    <meta name="keywords"
          content="英语 托福 GRE 考研 雅思 IELTS TOEFL SAT VOA BBC Quora 单词 听力 阅读 写作 口语 翻译 17bdc 背单词 单词量 单词量测试 单词 英语单词 背单词软件 英语学习网站">
    <meta name="description" content="扇贝单词、扇贝听力、扇贝口语、扇贝新闻、扇贝读书、扇贝炼句，六大应用让你在手机上就可以完成整个学习过程，有效地提升英语词汇及听说读写能力。扇贝，知道你在改变。">


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
            <a class="brand" href="/"><img src="https://static.baydn.com/static/img/logo_v4.png"></a>
            <div class="nav-collapse">

                <ul class="nav" style="z-index: 1040">


                    <li class="dropdown main-nav home ">
                        <a class="main-menu" href="/">首页</a>
                    </li>

                    <li class="dropdown main-nav
    active
">
                        <a href="/bdc/client/guide" class="main-menu">
                            单词
                        </a>
                    </li>

                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="/listen/">
                            听力
                        </a>
                    </li>

                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="/speak/">
                            口语
                        </a>
                    </li>

                    <li id="nav-news" class="dropdown main-nav  ">
                        <a class="main-menu" href="/news/articles">
                            短文
                        </a>
                    </li>

                    <li id="nav-books" class="dropdown main-nav  ">
                        <a class="main-menu" href="https://web.shanbay.com/reading/web-reading">
                            读书
                        </a>
                    </li>

                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="/sentence/review/">
                            炼句
                        </a>
                    </li>

                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="/academy/">
                            课程
                        </a>
                    </li>

                    <li class="dropdown main-nav  ">
                        <a class="main-menu" href="/community/">
                            社区
                        </a>
                    </li>

                </ul>

                <ul class="nav nav-right pull-right" style="z-index: 1000">

                    <li><a href="#" class="shortcuts-button">快捷键</a></li>

                    <li class="dropdown main-nav nav-avatar  ">
                        <a href="#" class="main-menu user-avatar" data-toggle="dropdown"> <i> <img
                                src="https://media-image1.baydn.com/people%2Favatar%2Fe615d20d7f2fb3d604c2f8ecf0c49aff.png@20w_20h"
                                width="20" height="20" class=""> </i>
                            graph
                            <img class="dropdown-arraw" src="https://static.baydn.com/static//img/icon-arraw.png">
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="sb-nav-menu-a" href="/web/users/mine/zone">我的空间</a></li>
                            <li><a class="sb-nav-menu-a" href="/checkin/mine/">我的打卡</a></li>
                            <li><a class="sb-nav-menu-a" href="/camp/">我的班级</a></li>
                            <li><a class="sb-nav-menu-a" href="/insurance/client/">我的保险</a></li>
                            <li class="divider"></li>
                            <li><a class="sb-nav-menu-a" href="/message/">短信</a></li>
                            <li><a class="sb-nav-menu-a" href="/coins/account/">贝壳</a></li>
                            <li class="divider"></li>
                            <li><a class="sb-nav-menu-a" href="/accounts/setting/">设置</a></li>

                            <li><a class="sb-nav-menu-a" href="/accounts/logout/">退出</a></li>
                        </ul>
                    </li>
                </ul>

                <form class="navbar-search pull-right" action="">
                    <div class="controls">
                        <div class="input-prepend">
                            <input type="text" class="search-input span2" placeholder="查词">
                            <img src="https://static.baydn.com/static/img/icon-remove.png" class="icon-remove hide">
                            <span class="add-on search-submited"><i class="icon-search"></i></span>
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>

    <div class="sub-menu
    active
">
        <ul class="container" style="height: 47px;">
            <li class="
    active
"><a id="bdc-new-review-link" href="/bdc/review/">单词学习</a></li>
            <li class=""><a href="/market/">扩展包</a></li>
            <li class=""><a href="/wordbook/books/mine/">单词书</a></li>
            <li class=""><a href="/bdc/learnings/library/#today">我的词库</a></li>
            <li><a href="/bdc/client/vocabprogress">单词进度</a></li>
            <li class=""><a href="/user/setting/bdc/">单词设置</a></li>
        </ul>
    </div>

    <div class="sub-menu ">
        <ul class="container">
            <li class=""><a href="/sentence/review/">炼句学习</a></li>
            <li class=""><a href="/sentence/book/">课程</a></li>
            <li class=""><a href="/sentence/setting/">炼句设置</a></li>
        </ul>
    </div>

    <div id="menu-news" class="sub-menu ">
        <ul class="container">
            <li class="">
                <a href="/news/articles">短文首页</a>
            </li>
            <li class="">
                <a href="/news/user/articles">收藏的短文</a>
            </li>
            <li class="">
                <a href="/read/plan/#news">短文计划</a>
            </li>

            <li class="">
                <a href="/read/stats/#news">短文进度</a>
            </li>

        </ul>
    </div>

    <div id="menu-books" class="sub-menu ">
        <ul class="container">
            <li class="">
                <a href="/read/books/">读书首页</a>
            </li>
            <li class="">
                <a href="/read/plan/">短文计划</a>
            </li>

            <li class="">
                <a href="/read/stats/">短文进度</a>
            </li>

        </ul>
    </div>


    <div class="sub-menu ">
        <ul class="container">
            <li class=""><a href="/listen/">听力学习</a></li>
            <li class=""><a href="/listen/books/my/">听力课程</a></li>
            <li class=""><a href="/listen/plan/">听力计划</a></li>
            <li class=""><a class="buy-listen-hints" href="/listen/#buy-hints">购买提示</a></li>
            <li class=""><a href="/listen/setting/">听力设置</a></li>
        </ul>
    </div>

    <div class="sub-menu ">
        <ul class="container">
            <li class=""><a href="/community/">论坛</a></li>
            <li class=""><a href="/team/team/">小组</a></li>
            <li class=""><a href="/footprints/">精选</a></li>
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
            <div class="row bdc-learning-header">
                <div class="span12"><p><span class="span-left">⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅</span> 扇贝单词 <span class="span-right">⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅⋅</span>
                </p></div>
            </div>
            <div class="hero-unit start-review new-start-review">
                <div class="row new-review-summary">
                    <div class="pull-left span7">
                        <h1 class="span2 today">150
                            <small>今日单词</small>
                        </h1>
                        <h1 class="span2">0
                            <small>新词</small>
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

    <!-- Review Again Mode Finished Info-->
    <script id="stat-master-percentage-tmpl" type="text/x-jquery-tmpl">
        <div class="row" id="stat-master-percentage-row">
            <div class="span10 offset1">
                <p>本轮测试的正确率： <span id="stat-master-percentage">${ correctness }%</span></p>
                <div>
                    {{if correctness < 100}}
                        <a class="btn btn-success btn-large" href="${ review_url }">学习未通过单词</a>
                    {{/if}}
                    <a class="btn btn-success btn-large" href="/">返回首页</a>
                </div>
            </div>
        </div>



    </script>

    <!-- Examples Review-->
    <script id="all-defn-tmpl" type="text/x-jquery-tmpl">
        <li class="defn">
            <div class="en-defn"><span class="pos" title="${pos3}"><b>${pos1}</b></span>{{html endf}} <span class="btn btn-mini btn-info">应用</span></div>
            <!-- <div class="cn-defn"><span class="cndf">${cndf}</span><span class="btn btn-mini btn-info">应用</span></div> -->
        </li>



    </script>
    <script id="examples-review-tmpl" type="text/x-jquery-tmpl">
        <div class="row" id="examples-review">
            <div class="span1"><h6 class="pull-right">例句温习</h6>
            </div>
            <div class="span9">
                <div class="row">
                    <div class="entries span9">
                    </div>
                </div>
                <div class="row"><div class="span10"><a href="javascript:;" class="continue continue-button"></a></div></div>
            </div>
        </div>



    </script>
    <script id="examples-review-entry-tmpl" type="text/x-jquery-tmpl">
        <div id="example-review-${review.id}" class="well example-entry" data-id="${review.id}">
            <h3 class="annotation">{{html example.annotation_html}}</h3>
            <div class="translation">${example.translation}</div>
            <div class="learning hide">
                <h3 class="word">${review.content}<small><span class="speaker speaker-icon"></span></small></h3>
                <div class="definition">${review.definition}</div>
                <div class="actions btn-group">
                    <button class="btn like">喜欢</button>
                    <button class="btn unlike">不喜欢</button>
                </div>
            </div>
        </div>



    </script>
    <!-- Resolved Learning Summary-->
    <script id="summary_resolved_learning_tmpl" type="text/x-jquery-tmpl">
        <div id="summary-resolved-learning-box" class="row">
            <div class="span1"><h6 class="pull-right">简单词</h6>
            </div>
            <div class="span9">
                <div class="row">
                    <div class="span9"><h4><p>下列单词会被标记为已经掌握（点击“撤销”取消本次操作）</p></h4></div>
                </div>
                <div class="row">
                    <table id="summary-resolved-learning-word-container" class="table span10 summary-table">
                    </table>
                </div>
                <div class="row"><div class="span10"><a href="javascript:;" class="continue continue-button"></a></div></div>
            </div>
        </div>



    </script>
    <script id="summary-resolved-learning-entry-tmpl" type="text/x-jquery-tmpl">
        {{if retention==100}}
            <tr id="summary-resolved-learning-${id}" class="${c}" data-id="${id}">
        {{else}}
            <tr id="summary-resolved-learning-${id}" class="${c} hide" data-id="${id}">
        {{/if}}
                <td title="${pron}" class="sound"><span class="speaker summary-speaker"></span></td>
                <td class="word">${content}</td>
                {{if G.collins && (G.collins.state ==1 || G.collins.state == 2) &&  (en_definition && en_definition.defn) }}
                <td class="definition">{{html en_definition.defn.replace(/vocab>/g,"span>")}}</td>
                {{else}}
                <td class="definition span4"><div>${definition}</div></td>
                {{/if}}
                <td class="">
                    <div class="review-setting">
                    </div>
                </td>
                <td class="retention span2"><div class="progress progress-success"><div class="bar" style="width:${retention*100/7}%"></div></div></td>
                <td class="operation span1"><span data-id="${id}" class="icon-remove summary-btn-unresolve-learning"></span></td>
            </tr>



    </script>
    <!-- Summary -->
    <script id="summary_tmpl" type="text/x-jquery-tmpl">
        <div id="summary-box" class="row">
            <div class="span1"><h6 class="pull-right">总结</h6>
            </div>
            <div class="span9">
                <div class="row">
                    <div class="span9"><h4><p>快速回顾</p></h4></div>
                </div>
                <div class="row">
                    <table class="table span10 summary-table">
                    </table>
                </div>
                <div class="row"><div class="span10"><a href="javascript:;" class="continue continue-button"></a></div></div>
            </div>
        </div>



    </script>
    <script id="summary-entry-tmpl" type="text/x-jquery-tmpl">
        {{if retention==100}}
        <tr id="summary-${id}" class="${c} hide" data-id="${id}">
        {{else}}
        <tr id="summary-${id}" class="${c}" data-id="${id}">
        {{/if}}
            <td title="${pron}" class="sound"><span class="speaker summary-speaker"></span></td>
            <td class="word">${content}</td>
            <!-- <td class="definition span4"><div>${definition}</div></td> -->
            {{if G.collins && (G.collins.state ==1 || G.collins.state == 2) &&  (en_definition && en_definition.defn) }}
            <td class="definition">{{html en_definition.defn.replace(/vocab>/g,"span>")}}</td>
            {{else}}
            <td class="definition span4"><div>${definition}</div></td>
            {{/if}}
            <td class="">
                <div class="review-setting">
                </div>
            </td>
            <td class="retention span2"><div class="progress progress-success"><div class="bar" style="width:${retention*100/7}%"></div></div></td>
            <td class="operation span1"><span data-id="${id}" class="summary-icon-list"></span></td>
        </tr>



    </script>
    <!-- Learning detail -->
    <script id="learning_word_tmpl" type="text/x-jquery-tmpl">
        <div id="learning-box" class="review-id row">
            <div class="test-box span12 learning-hint-container hide">
                <div id="word-hint" class="row new-word-row">
                    <div class="span10 offset1">
                        <h1 class="">${content}</h1>
                        <div class="learning-speaker">
                            <h1><small> {{if pron}}/${pron}/{{/if}} </small></h1>
                            <span class="audio uk">UK<span class="speaker-icon"></span></span>
                            <span class="audio us">US<span class="speaker-icon"></span></span>
                        </div>
                    </div>
                </div>

                {{if review_status==3}}



{{if example && example.annotation_html.length > content.length}}
<div id="example-hint" class="row learning-hint {{if review_status !=3}}learning-hint-hidden{{/if}}">
    <div class="span10 offset1">
        <div class="hint-content sentence annotation">
            {{html example.annotation_html}}
            <span class="review-speaker speaker">&nbsp;</span>
        </div>
    </div>
</div>
{{/if}}




{{if roots && roots.roots && roots.roots.length > 0}}
<div id="roots-hint" class="row learning-hint learning-hint-hidden">
    <div class="span10 offset1">
        <div class="hint-content roots-wrapper">
            {{each(index,content,meaning_en,meaning_cn,note,vocabulary,representatives) roots.roots}}
                <div class="basic-info row">
                    <div class="span8">
                        {{if content }}
                        <span class="content">${content}</span>
                        {{/if}}
                        &nbsp;
                        {{if meaning_cn }}
                        <span class="meaning-cn">${meaning_cn}</span>
                        {{/if}}
                    </div>
                </div>
                <div class="advanced-info row">
                    {{if note }}
                        <div class="span8">
                            <label><b>词根助记：<span class="root-vocabulary-note">${vocabulary} : ${note}</span></b></label>
                        </div>
                    {{/if}}
                    {{if representatives.length > 0}}
                    <div class="brevity span8">
                        <label><b>同根词</b> &nbsp; </label>
                        {{each(index, vocabulary_id, definition, word, has_learned) representatives.slice(0,5)}}
                            {{if has_learned}}
                                <label class="learned">${word}</label>
                            {{else}}
                                <label class="notlearned">${word}</label>
                            {{/if}}
                            {{if index != 4}}
                                |
                            {{/if}}
                        {{/each}}
                    </div>
                    {{/if}}
                </div>
                {{if index < roots.length - 1}}<hr>{{/if}}
            {{/each}}
        </div>
    </div>
</div>
{{/if}}

                {{else}}



{{if roots && roots.roots && roots.roots.length > 0}}
<div id="roots-hint" class="row learning-hint learning-hint-hidden">
    <div class="span10 offset1">
        <div class="hint-content roots-wrapper">
            {{each(index,content,meaning_en,meaning_cn,note,vocabulary,representatives) roots.roots}}
                <div class="basic-info row">
                    <div class="span8">
                        {{if content }}
                        <span class="content">${content}</span>
                        {{/if}}
                        &nbsp;
                        {{if meaning_cn }}
                        <span class="meaning-cn">${meaning_cn}</span>
                        {{/if}}
                    </div>
                </div>
                <div class="advanced-info row">
                    {{if note }}
                        <div class="span8">
                            <label><b>词根助记：<span class="root-vocabulary-note">${vocabulary} : ${note}</span></b></label>
                        </div>
                    {{/if}}
                    {{if representatives.length > 0}}
                    <div class="brevity span8">
                        <label><b>同根词</b> &nbsp; </label>
                        {{each(index, vocabulary_id, definition, word, has_learned) representatives.slice(0,5)}}
                            {{if has_learned}}
                                <label class="learned">${word}</label>
                            {{else}}
                                <label class="notlearned">${word}</label>
                            {{/if}}
                            {{if index != 4}}
                                |
                            {{/if}}
                        {{/each}}
                    </div>
                    {{/if}}
                </div>
                {{if index < roots.length - 1}}<hr>{{/if}}
            {{/each}}
        </div>
    </div>
</div>
{{/if}}




{{if example && example.annotation_html.length > content.length}}
<div id="example-hint" class="row learning-hint {{if review_status !=3}}learning-hint-hidden{{/if}}">
    <div class="span10 offset1">
        <div class="hint-content sentence annotation">
            {{html example.annotation_html}}
            <span class="review-speaker speaker">&nbsp;</span>
        </div>
    </div>
</div>
{{/if}}

                {{/if}}


                {{if default_definition_type == 2 && en_definition && en_definition.defn}}
                <div id="definition-en-hint" class="row learning-hint learning-hint-hidden">
                    <div class="span10 offset1">
                        <div class="hint-content">
                            <span class="badge">${ en_definition.pos }</span>
                            {{html en_definition.defn.replace(/vocab>/g,"span>")}}
                        </div>
                    </div>
                </div>
                {{/if}}

                {{if definition}}
                <div id="definition-cn-hint" class="row learning-hint learning-hint-hidden">
                    <div class="span10 offset1">
                        <div class="hint-content">
                            ${ definition }
                        </div>
                    </div>
                </div>
                {{/if}}
                <div class="row hint-test-row">
                    <div id="answer" class="span10 offset1 operation">
                        <div class="row test-answers  first">
                            <a class="known span10" href="javascript:void(0)"><span>1. </span>想起来了</a>
                        </div>
                        <div class="row test-answers">
                            <a class="unknown span10" href="javascript:void(0)"><span>2. </span>没想起来</a>
                        </div>
                        <div class="detail-button-container hide">
                            <a class="known span10" href="javascript:void(0)"><span>1. </span>查看详细</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="test-box span12 learning-detail-container hide">
                {{if forget_num == 0 && prev_mode == "preview" && update_type == "fresh" && result == 2}}
                    <div class="row i-known-hint">
                        <div class="span9 offset1">
                            <p class="alert-container alert">
                                你刚刚表示认识这个单词，今天不用再安排学习。
                                <a class='btn-forget' href='javascript:;'>撤销</a>
                                (快捷键2)
                            </p>
                            <span class="hide">稍后将继续安排这个单词的学习</span>
                        </div>
                    </div>
                {{/if}}

                <div id="learning_word" class="row">
                            <div class="word span10">
                                <div class="row">
                                    <div class="span1"><h6 class="pull-right">&nbsp;</h6></div>
                                    <div class="span9">

                                            <h1 class="content pull-left" style="">{{if syllables}}${syllables}{{else}}${content}{{/if}} <small>{{if pron}}/${pron}/{{/if}}</small></h1>
                                            <span class="hide" id="current-learning-word">${content}</span>

                                        {{if has_audio}}
                                            <div class="pull-left learning-speaker" >
                                                <span class="audio uk">UK<span class="speaker-icon"></span></span>
                                                <span class="audio us">US<span class="speaker-icon"></span></span>
                                            </div>
                                        {{/if}}

                                            <div class="pull-right learning-operations">
                                                <a href="javascript:;" class="twi-btn-left spell"><span title="拼写"></span></a><a href="javascript:;" class="twi-btn-right pass" data-content='<p style="font-size: 15px; color: #209E85">这个单词已经被标为太简单，短期内系统将不再安排这个单词的学习</p><button class="restore_easy btn" style="font-size: 14px;">撤销此操作</button>' data-original-title='<span style="font-weight: bold; font-size: 14px;">太简单</span>'><span title="太简单"></span></a>
                                            </div>

                                    </div>
                                </div>



        <div class="row">
            <div class="span1"><h6 class="pull-right">单词解释</h6></div>
            <div id="review-definitions" class="span9">
                <div class="well">
                    <div class="row">
                        {{if (collins.state ==1 || collins.state == 2)}}
                            {{if has_en_def}}
                            <div class="span1"><span class="part-of-speech label">${en_definition.pos}</span></div>
                            <ol class="span7">
                                <li class="definition">
                                {{if detail_mode}}
                                    <span class="content">{{html en_defn}}</span>
                                {{else}}
                                    <span class="content">{{html en_defn_empty}}</span>
                                {{/if}}
                                </li>
                            </ol>
                            {{else}}

                            <div class="cndf span7"><span class="text">${definition}</span></div>

                            {{/if}}
                        {{else}}

                                <div class="cndf span7"><span class="text">${definition}</span></div>

                            {{if has_en_def}}
                            {{if review.review_status != 0 && review.review_status != 3}}
                                <a href="javascript:;" id="show_en_df" class="sblink pull-right">英语释义</a>
                            {{/if}}
                            {{/if}}
                            <a class="sblink pull-right" href="javascript:void(0)" id="edit_df">编辑</a> &nbsp;
                        {{/if}}
                    </div>
                    {{if !(collins.state ==1 || collins.state==2)}}
                        {{if mode && mode ==  "explore"}}
                            <div class="endf clear row {{if (default_definition_type != 2) }}hide{{/if}}">
                                {{each(speech, definitions) en_definitions}}
                                     <div class="span1"><span class="part-of-speech label">${speech}</span></div>
                                     <ol class="span7">
                                     {{each(i, def) definitions}}
                                        <li class="definition">
                                            <span class="content">{{html def.replace(/vocab>/g, "span>")}}</span>
                                        </li>
                                    {{/each}}
                                    </ol>
                                {{/each}}
                            </div>
                        {{else}}
                            <div class="endf hide carousel clear slide {{if (default_definition_type != 2) }}hide{{/if}}">
                                <div class="carousel-inner">
                                {{each(speech, definitions) en_definitions}}
                                     {{each(i, def) definitions}}
                                        <div class="definition item span6">
                                            <span class="part-of-speech label">${speech}</span>
                                            <span class="content">${def}</span>
                                        </div>
                                    {{/each}}
                                {{/each}}
                                </div>
                                <a class="carousel-control left" href=".endf" data-slide="prev">&lsaquo;</a>
                                <a class="carousel-control right" href=".endf" data-slide="next">&rsaquo;</a>
                            </div>
                        {{/if}}
                    {{/if}}

                    {{if mode && mode ==  "explore"}}
                    <div class='all-defn'>
                        <div>
                            <a href="javascript:;" class="defn-trigger collins sblink hide">
                                <i class="icon icon-sitemap"></i> 显示全部释义(V)
                            </a>
                            <p class="collins-expired-hint alert hide">
                                <button class="close" type="button">
                                    <span title=不再提醒>&times;</span>
                                </button>
                                用英文学英文（柯林斯高阶精华版）应用已经过期，<a href='/market/app/collins/' target='_blank'>点击这里</a>  去续费或者停用
                            </p>
                        </div>
                        <div class="loading hide">
                            <span>正在获取更多数据 ...</span>
                        </div>
                        <p class="remind alert hide">
                            该单词只有一项释义
                        </p>
                        <ol></ol>
                        {{if collins.code_name == "oxford"}}
                        <p class="nocollins hide">
                        </p>
                        {{/if}}
                        {{if collins.code_name == "collins"}}
                        <p class="nocollins hide">
                            <a href="/market/app/collins/"> 关于柯林斯词典</a>
                        </p>
                        {{/if}}
                    </div>
                    {{/if}}
                </div>
                <div class="modal hide edit-definition-modal">
                    <div class="modal-header">
                        <button class="close" data-dismiss="modal"></button>
                        <h3>正在编辑释义</h3>
                    </div>
                    <div class="modal-body">
                        <textarea id="def-box" class="span7" rows="3" name="definition">${definition}</textarea>
                    </div>
                    <div class="modal-footer">
                        <a href="#" class="btn" data-dismiss="modal">关闭</a>
                        <a href="#" class="btn btn-primary save" data-dismiss="modal">保存</a>
                    </div>
                </div>
            </div>
        </div>



                            </div>
                            <div id="cliparts" class="span2">
                            </div>
                </div>

                <div id="roots" class="row">
                </div>
                <div id="affix" class="row">
                </div>
                <div id="learning-examples-box" class="row">
                </div>
                <div id="notes-box" class="row">
                </div>
                <div id="spell-modal-box">
                </div>
                <div class="pass_tip hide">
                   此操作表示你对该单词已经非常熟悉，不希望再进行复习；因此扇贝网系统会把这一单词标识为你已经掌握，未来不再安排复习。
                </div>

                <div class="row"><div class="span10"><a href="javascript:;" class="continue continue-button"></a></div></div>
            </div>
        </div>



    </script>
    <script type="text/x-jquery-tmpl" id="ex-create-tmpl">
        <div class="span1"><h6 class="pull-right">例句</h6></div>
        <div class="span9">
            <ul id="example-tab" class="nav nav-tabs">
                <li class="active"><a href="#ex-defaults-box" class="">默认例句</a></li>
                <li><a class="ex-sys-box-tab" href="#ex-sys-box">词典例句</a></li>
                <li><a class="ex-mine-box-tab" href="#ex-mine-box">自建例句</a></li>
                    <li><a class="ex-user-box-tab" href="#ex-user-box">共享例句</a></li>
                <li><a href="#ex-create">创建例句</a></li>
            </ul>
            <div class="tab-content">
                <div id="ex-create" class="ex-group tab-pane ">
                    <div class="title">
                        <div class="alert alert-info"> 造句会加深你对单词的印象和理解</div>
                    </div>
                    <div class="content">
                        <form id="make-example" method="POST">
                            <p id="enexerror" class="error hide">
                                例句不能为空。
                            </p>
                            <p id="nomainerror" class="error hide">
                                例句必须包含原词，或者它的复数形式（名词），也可以是不同时态（动词）
                            </p>
                            <p id="translationerror" class="error hide">
                                译文不能为空。
                            </p>
                            <p id="msg-success" class="success hide">
                                <span>你的例句已创建成功</span>
                                <a href="javascript:void(0)">请查阅</a>
                            </p>
                            <label for="newex">例句：</label>
                            <textarea id="newex" class="span9" rows="3" name="original"></textarea>
                            <label for="newtrans">译文：</label>
                            <textarea id="newtrans" class="span9" rows="3"  name="translation"></textarea>
                            <span class="loading hide">&nbsp;</span>
                            <div><input type="submit" class="btn" value="添加"/></div>
                        </form>
                    </div>
                </div>
                <div class="tab-pane row active" id="ex-defaults-box">
                    {{if examples}}
                    <ol class="span9">
                        <div class="null">暂时还没有默认例句哦，你可以创建自己的例句</div>
                    </ol>
                    {{else}}
                    {{/if}}
                </div>
                <div class="tab-pane row" id="ex-mine-box">
                    <ol class="span9">
                        <div class="null">暂时还没有自建例句哦，你可以创建自己的例句</div>
                    </ol>
                    <div class="holder hide"><ul class="ex-mine-box-pagination"></ul></div>
                </div>
                <div class="tab-pane row" id="ex-sys-box">
                    <ol class="span9">
                        <div class="null">暂时还没有词典例句哦</div>
                    </ol>
                    <div class="holder hide"><ul class="ex-sys-box-pagination"></ul></div>
                </div>
                <div class="tab-pane row" id="ex-user-box">
                    <ol class="span9">
                        <div class="null">暂时还没有共享例句哦</div>
                    </ol>
                    <div class="holder hide"><ul class="ex-user-box-pagination"></ul></div>
                </div>
            </div>
        </div>



    </script>
    <script type="text/x-jquery-tmpl" id="example-tmpl">
        {{each(index, example) examples}}
        <li data-id="${example.id}" class="row" id="example-${example.id}">
            <div class="span9">
                <div class="index pull-left">${index + 1}. </div>
                <div class="pull-left body">
                    <div class="annotation enex">
                        {{if example.audio_addresses.uk}}
                            <span class="example-audio-container">
                                {{if auto_play_mode == AUDIO_UK}}
                                    <span class="example-audio uk">
                                {{else}}
                                    <span class="example-audio us">
                                {{/if}}
                                    <span class="speaker-icon"></span>
                                </span>
                            </span>
                        {{/if}}

                        {{if example.annotation_html}}
                            {{html example.annotation_html}}
                        {{else}}
                            ${example.original}
                        {{/if}}
                    </div>
                    <div class="cnex">${example.translation}</div>
                    <div class="edit-example-box">
                    </div>
                </div>
                <div class="actions-wrap">
                    <div class="actions hide btn-group pull-right">
                        <a class="like btn btn-mini" href="javascript:void(0)">喜欢（${likes}）</a>
                        <a class="unlike btn btn-mini" href="javascript:void(0)">不喜欢（${unlikes}）</a>
                        <a class="more hide btn btn-mini" href="javascript:void(0)">更多</a>
                    </div>
                </div>
            </div>
        </li>
        {{/each}}



    </script>
    <script type="text/x-jquery-tmpl" id="review-setting-modal-tmpl">
        <div class="modal hide review-setting-modal">
          <div class="modal-header">
            <button class="close" data-dismiss="modal"><span class="review-setting-modal-close"></span></button>
            <h3>${content}</h3>
            <small>${definition}</small>
          </div>
          <div class="modal-body">
            <p>
                <form class="form-inline">
                    <div id="level-setting">
                        <h3>单词的目标掌握程度</h3>
                        <label class="radio">
                            <input type="radio" value="1" id="l1" name="level">
                        </label>
                        <label class="hint" for="l1">再认</label>

                        <label class="radio">
                            <input type="radio" id="l2" value="2" name="level">
                        </label>
                        <label class="hint" for="l2">拼写</label>
                    </div>

                    <div class="hide" id="familarity-setting">
                        <h3>设置熟悉度</h3>
                        <input type="radio" value="1" id="r1" name="retention">
                        <label for="r1">不认识</label>
                        <input type="radio" value="2" id="r2" name="retention">
                        <label for="r2">有些印象</label>
                        <input type="radio" value="3" id="r3" name="retention">
                        <label for="r3">非常熟悉</label>
                    </div>
                </form>
            </p>
          </div>
          <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal">关闭</a>
            <a href="#" class="btn-save-target-level save" data-dismiss="modal">保存</a>
          </div>
        </div>



    </script>
    <script type="text/x-jquery-tmpl" id="edit-example-modal-tmpl">
                    <div class="modal hide edit-example-modal">
                      <div class="modal-header">
                        <button class="close" data-dismiss="modal">&nbsp;</button>
                        <h3>编辑例句</h3>
                      </div>
                      <div class="modal-body">
                        <p>
                            <form>
                                <textarea class="original span7" rows="3">${first}${mid}${last}</textarea>
                                <br/>
                                <textarea class="translation span7">${translation}</textarea>
                            </form>
                        </p>
                      </div>
                      <div class="modal-footer">
                        <a href="#" class="btn" data-dismiss="modal">关闭</a>
                        <a href="#" class="btn btn-danger delete" data-dismiss="modal">删除</a>
                        <a href="#" class="btn btn-primary save">保存</a>
                      </div>
                    </div>



    </script>

    <!-- Notes section-->
    <script type="text/x-jquery-tmpl" id="notes-tmpl">
        <div class="span1"><h6 class="pull-right">笔记</h6></div>
        <div class="span9">
            <ul id="note-tab" class="nav nav-tabs">
                <li class="active"><a class="note-mine-box-tab" href="#note-mine-box">我的笔记</a></li>
                <li><a class="note-user-box-tab" href="#note-user-box">共享笔记</a></li>
                <li><a href="#note-create">创建笔记</a></li>
            </ul>
            <div class="tab-content">
                <div class="tab-pane row active" id="note-mine-box">
                    <ol class="span9">
                        <div class="null">你可以记录自己的笔记，或者收藏他人分享的</div>
                    </ol>
                    <div class="holder hide"><ul class="note-mine-box-pagination"></ul></div>
                </div>
                <div class="tab-pane row" id="note-user-box">
                    <ol class="span9">
                        <div class="null">暂时还没有共享笔记哦</div>
                    </ol>
                    <div class="holder hide"><ul class="note-user-box-pagination"></ul></div>
                </div>
                <div id="note-create" class="tab-pane">
                    <div class="title">
                        <div class="alert alert-info"> 笔记：用法，助记法，只要是你觉得有帮助的都可以</div>
                    </div>
                    <div class="content">
                        <form id="make-note" method="POST">
                            <p id="error" class="msg hide">
                                笔记不能为空
                            </p>
                            <p id="msg-success" class="msg hide">
                                <span>你的笔记创建成功</span>
                                <a href="javascript:void(0)">请查阅</a>
                            </p>
                            <textarea name="note" class="span7" rows="3"></textarea>
                            <span class="loading hide">&nbsp;</span>
                            <div class=""><input type="submit" class="btn" value="添加"/></div>
                        </form>
                    </div>
               </div>
            </div>



    </script>
    <script id="note-tmpl" type="text/x-jquery-tmpl">
        {{each(index, item) notes}}
        <li data-id="${item.id}" class="row" id="note-${item.id}">
            <div class="span9">
                <div class="index pull-left">${index + 1}. </div>
                <div class="pull-left content">
                    <span>${item.content}</span>
                    <div class="author">作者 <a href="/user/list/${item.username}/" target="_blank">${item.username}</a></div>
                </div>
                <div class="">
                    <div class="actions btn-group  hide pull-right">
                        <a class="btn like btn-mini" href="javascript:void(0)">喜欢（${likes}）</a>
                        <a class="btn unlike btn-mini" href="javascript:void(0)">不喜欢（${unlikes}）</a>
                        <a class="more hide btn btn-mini" href="javascript:void(0)">更多</a>
                    </div>
                </div>
                <div class="edit-note-box"></div>
            </div>
        </li>
        {{/each}}



    </script>
    <script type="text/x-jquery-tmpl" id="edit-note-modal-tmpl">
        <div class="modal hide edit-note-modal">
          <div class="modal-header">
            <button class="close" data-dismiss="modal">&nbsp;</button>
            <h3>编辑笔记</h3>
          </div>
          <div class="modal-body">
            <p>
                <form>
                    <textarea class="note-textarea span7" rows="4">${content}</textarea>
                </form>
            </p>
          </div>
          <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal">关闭</a>
            <a href="#" class="btn btn-danger delete" data-dismiss="modal">删除</a>
            <a href="#" class="btn btn-primary save" data-dismiss="modal">保存</a>
          </div>
        </div>



    </script>

    <script id="en_definition_tmpl" type="text/x-jquery-tmpl">
        {{each(speech, definitions) en_definitions}}
            <div class="definition">
                <div class="part-of-speech">${speech}</div>
                <ul class="defintions">
                    {{each(i, def) definitions}}
                        <li>
                            <span class="counter">${i+1}:</span>
                            <span class="content">${def}</span>
                        </li>
                    {{/each}}
                </ul>
            </div>
        {{/each}}



    </script>
    <script id="spell-modal-tmpl" type="text/x-jquery-tmpl">
            <div class="modal hide spell-modal">
              <div class="modal-header">
                <button class="close" data-dismiss="modal"><span class="review-spell-modal-close"></span></button>
                <h3>拼写练习</h3>
                <small>${definition}</small>
              </div>
              <div class="modal-body">
                    <p>
                        <h4 class="instruction">拼写必须和单词完全一致 <small>按s键可以打开此对话框</small></h4>
                    </p>
                    <input id="spell-box" class="input-xlarge" type="text" />
                    <p id="hint-content" class="hide">单词为：${content}</p>
                    <div id="msg-try" class="alert alert-warn hide">你的拼写还不正确，请继续尝试。</div>
                    <div id="msg-success" class="msg alert alert-success hide">恭喜你拼对了！</div>
              </div>
            </div>



    </script>
    <!-- Cliparts -->
    <script id="cliparts-tmpl" type="text/x-jquery-tmpl">
        <div class="image">
            {{if is_due}}
                <button type="button" class="disable-close">
                    <span title=不再提醒>&times;</span>
                </button>
            {{/if}}

                    <a target="_blank" class="popup" href="${target_url}"><img src="${current.url}" /></a>

                    <a href="javascript:;" class="center correct" data-id="${current.id}"><h6>报告图片错误</h6></a>
        </div>
        <div class="cliparts-setting-box">
        </div>



    </script>
    <script id="cliparts-setting-tmpl" type="text/x-jquery-tmpl">
        <div class="modal hide cliparts-setting-modal">
          <div class="modal-header">
            <button class="close" data-dismiss="modal"></button>
            <h3>选择默认配图</h3>
          </div>
          <div class="modal-body">
            <ul class="thumbnails">
                {{each(url, id) all}}
                <li class="span2" style="width:35%">
                    <a href="#" class="thumbnail"><img src="${url}"/></a>
                    <p><a class="set-default-clipart" data-dismiss="modal" href="/cliparts/default/set/?learning_id=${review_id}&clipart_id=${id}">默认启用</a></p>
                </li>
                {{/each}}
            </ul>
          </div>
          <div class="modal-footer">
            <a href="#" class="btn btn-primary ok" data-dismiss="modal">I see</a>
          </div>
        </div>



    </script>
    <!-- Affix Word Tree Container -->
    <script id="affix-word-tree-tmpl" type="text/x-jquery-tmpl">
    </script>
    <!-- Affix Word Tree Prompt Modal Tmpl -->
    <script id="affix-word-tree-prompt-modal-tmpl" type="text/x-jquery-tmpl">
    <div class="modal hide feedback-modal" id="affix-prompt-modal">
        <div class="modal-header">
        <button class="close" data-dismiss="modal"></button>
        <h3>词汇派生<span class="affix-modal-close-hint">(按 F 键关闭本窗口)</span></h3>
        </div>
        <div class="modal-body" id="affix_word_tree_modal_container">
        </div>
        <div id="query-word-container">
        </div>
    </div>



    </script>
    <!-- Affixes -->
    <script id="affix-tmpl" type="text/x-jquery-tmpl">
        <div class="word span10">
            <div class="row">
                <div class="span1">
                    <h6 class="pull-right">词汇派生</h6>
                </div>
                <div class="span9">
                    <div class="well">
                        <div id="affix_basic_info_container">
                            <div class="row">
                                <div class="affix_basic_info span7 hide">
                                </div>
                                <div class="affix_basic_branch span7">
                                </div>
                            </div>
                            <div id="affix_arrow" class="hide"><span class="affix_arrow">——></span></div>
                            <div id="affix_word" class="hide"><span class="affix_word"></span></div>
                            <div id="affix_current_word" class="hide"><span class="affix_word affix_current_word"></span></div>
                            <div id="one_word_branch_hint" class="hide"><span>是一个根词</span></div>
                            <div id="affix_word_branch_arrow" class="hide">
                                <i class="icon-arrow-right"></i>
                            </div>
                            <div id="affix_detail_a" class="hide">
                                <a id="affix_detail" class="span1">
                                    <span class="on">详细(F)</span>
                                    <span class="off hide">收起(F)</span>
                                </a>
                            </div>
                        </div>
                        <div class="hide" id="affix_word_tree_container">
                        </div>
                        <div class="span1" id="word_tree_branch_template" style="margin: 0">
                        </div>
                    </div>
                </div>
            </div>
        </div>



    </script>
    <!-- Affix Word Tree Node Detail -->
    <script id="query-word-tmpl" type="text/x-jquery-tmpl">
        {{if data_dict}}
        {{each(content, pronunciation, definition) data_dict}}
        <div class="query-word" id="query-word">
            <div class="title" style="display: block;">
                {{if content}}
                    <span class="word">${content}</span>
                {{/if}}
                {{if pronunciation}}
                    <span class="pronunciation">/${pronunciation}/</span>
                {{/if}}
            </div>
            <div class="note">
                {{if affix_dict.affix.note}}
                    <span class="affix_note_title">[派生解释] </span><span class="affix_note">${affix_dict.affix.note}</span>
                {{/if}}
            </div>
            <div class="definition" style="display: block;">
                {{if definition}}
                    <span class="definition">${definition}</span>
                {{/if}}
            </div>
            <span class="actions">
                <span id="add" class="btn btn-mini btn-success" data-id="${object_id}" style="display: none;">添加</span>
                <span class="added" style="display: none;">你之前添加过这一单词<span id="forget" class="link">我忘了</span></span>
                <span class="loading" style="display: none;">正在加载数据 ...</span>
                <span class="success" style="display: none;">成功添加进你的词库</span>
                <span class="passed" style="display: none;">从你的学习计划里删除</span>
                <span id="failed" style="display: none;" class="error">添加失败<span id="retry" class="link">重试</span></span>
                <span id="loading_failed" style="display: none;" class="error">cannot fetch the word info</span>
                <span id="note" class="error"></span>
            </span>
        </div>
        {{/each}}
        {{/if}}



    </script>
    <!-- Affix Word Tree Container -->
    <script id="affix-basic-info-tmpl" type="text/x-jquery-tmpl">
        {{if word_branch_data.length > 0}}
        <div class="row">
            <div class="affix_basic_info span7">
                {{each(parent_id, word, id) word_branch_data}}
                    <span class="affix_word">${word}</span>
                {{/each}}
            </div>
            <a class="span1" id="affix_detail">
                <span class="on" style="display: inline;">详细(R)</span>
                <span class="off hide" style="display: none;">收起(R)</span>
            </a>
        </div>
        {{/if}}



    </script>
    <!-- Roots -->
    <script id="roots-tmpl" type="text/x-jquery-tmpl">
        {{if roots.length > 0}}
        <div class="span1"><h6 class="pull-right">词根 <a target="_blank" class="help" href="${target_url}"><i class="icon-question-sign"></i></a>
        </h6></div>
        <div class="roots-wrapper span9">
            <div class="well">
                {{each(index,content,meaning_en,meaning_cn,note,vocabulary,representatives) roots}}
                    <div class="basic-info row">
                        <div class="span8">
                            {{if content }}
                            <span class="content">${content}</span>
                            {{/if}}
                            &nbsp;
                            {{if meaning_cn }}
                            <span class="meaning-cn">${meaning_cn}</span>
                            {{/if}}
                        </div>
                        <div class="span8">
                            {{if note }}
                                <label><b>词根助记：<span class="root-vocabulary-note">${vocabulary} : ${note}</span></b></label>
                            {{/if}}
                        </div>
                    </div>
                    {{if representatives.length > 0}}
                        <div class="advanced-info row">
                            <p>
                                <div class="brevity span7">
                                    <label><b>同根词</b> &nbsp; </label>
                                    {{each(vocabulary_id, definition, word, has_learned) representatives}}
                                        {{if has_learned}}
                                            <label class="learned">${word}</label>
                                        {{else}}
                                            <label class="notlearned">${word}</label>
                                        {{/if}}
                                        |
                                    {{/each}}
                                </div>
                                <a class="show-details span1" href="javascript:void(0)">
                                    <span class="on"> 详细(R)</span>
                                    <span class="off hide"> 收起(R)</span>
                                </a>
                            </p>
                        </div>
                        <div class="row">
                            <div class="details span8 hide">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    {{each(vocabulary_id, definition, note, word, has_learned) representatives}}
                                        <tr class="detail">
                                            <td class="word">
                                            {{if has_learned}}
                                                <span class="learned-root-vocabulary">${word}</span>
                                            {{else}}
                                                <span>${word}</span>
                                            {{/if}}
                                            </td>
                                            <td class="note" width="70%">
                                                ${note}
                                                <div class="definition-btn">
                                                    <a href="javascript:;" class="">显示释义</a><span class="definition hide">：${definition}</span>
                                                </div>
                                            </td>
                                            <td class="add">
                                            {{if has_learned}}
                                                <button class="disabled btn"><span class="icon-ok"></span></button>
                                            {{else}}
                                                <button class="add btn" target="_blank" data-id="${vocabulary_id}" href="javascript:;"><i class="icon-plus"></i></button>
                                            {{/if}}
                                            </td>
                                        </tr>
                                    {{/each}}
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    {{/if}}
                    {{if index < roots.length - 1}}<hr>{{/if}}
                {{/each}}
            </div>
        </div>
        {{/if}}



    </script>

    <script id="roots-promotion-tmpl" type="text/x-jquery-tmpl">
        <div class="span1"><h6 class="pull-right">词根 <a target="_blank" class="help" href="${target_url}"><i class="icon-question-sign"></i></a>
        </h6></div>
        <div class="roots-due-wrapper span9">
            <div class="due_msg alert">
            	体验“智慧词根”功能， 揭示词汇内在联系， 加速你的记忆<a class="btn btn-success btn-mini" style="margin-left: 20px;" target="_blank" href="${target_url}">查看詳情</a>
            </div>
        </div>



    </script>
    <script id="roots-due-tmpl" type="text/x-jquery-tmpl">
        <div class="span1"><h6 class="pull-right">词根 <a target="_blank" class="help" href="${target_url}"><i class="icon-question-sign"></i></a>
        </h6></div>
        <div class="roots-due-wrapper span9">
            <div class="due_msg alert">
                <button type="button" class="close">
                    <span title=不再提醒>&times;</span>
                </button>
                智慧词根的使用已经到期，如需继续使用或者停用，请点 <a target="_blank" href="${target_url}">这里</a>
            </div>
        </div>



    </script>
    <script id="affixes-due-tmpl" type="text/x-jquery-tmpl">
        <div class="span1"><h6 class="pull-right">词汇派生 <a target="_blank" class="help" href="${target_url}"><i class="icon-question-sign"></i></a>
        </h6></div>
        <div class="roots-due-wrapper span9">
            <div class="due_msg alert">
                <button type="button" class="close">
                    <span title=不再提醒>&times;</span>
                </button>
                词汇派生的使用已经到期，如需继续使用或者停用，请点 <a target="_bkank" href="${target_url}">这里</a>
            </div>
        </div>



    </script>
    <!-- Review test wrong. -->
    <script id="review-error-tmpl" type="text/x-jquery-tmpl">
        <div class="modal hide review-error-modal">
          <div class="modal-header">
            <button class="close" data-dismiss="modal"></button>
            <h3>你大概已经忘了这个单词</h3>
          </div>
          <div class="modal-body">
            <p class="gray">我们后续会加强你对它的复习</p>
            <div class="correct alert alert-success">
                <p class="title">正确答案：</p>
                <!-- <h3 class="c">${correct_answer}</h3> -->
                <h3 class="c">{{html correct_answer.replace(/vocab>/g, "span>")}}</h3>
            </div>
            <div class="error alert alert-error">
                <p class="title">你的答案是</p>
                <!-- <h3 class="c">${wrong_answer}</h3> -->
                <h3 class="c">{{html wrong_answer.replace(/vocab>/g, "span>")}}</h3>
            </div>

          </div>
          <div class="modal-footer">
            <a href="#" class="btn btn-success btn-large ok" data-dismiss="modal">确认</a>
          </div>
        </div>



    </script>

    <!-- Preview template -->
    <script id="preview_tmpl" type="text/x-jquery-tmpl">
    <div id="preview" class="row">
        <div class="span10">
            <div  class="row word-row new-word-row">
                <div class="span10 offset1">
                    <h1>${content}</h1>
                    {{if has_audio}}
                    <div class="learning-speaker">
                        <h1><small> {{if pron}}/${pron}/{{/if}} </small></h1>
                        <span class="audio uk">UK<span class="speaker-icon"></span></span>
                        <span class="audio us">US<span class="speaker-icon"></span></span>
                    </div>
                    {{/if}}
                </div>
                {{if review.review_status == 3 && example && example.annotation_html.length > content.length}}
                    <div class="span10 offset1">
                        <div class="sentence hint-content well annotation">
                            {{html example.annotation_html}}
                        </div>
                    </div>
                {{/if}}
            </div>
            <div class="row">
                <div id="answer" class="span10 offset1 operation">
                    <div class="row test-answers first">
                        <a class="known span10" href="javascript:void(0)"><span>1. </span>认识</a>
                    </div>
                    <div class="row test-answers">
                        <a class="unknown span10" href="javascript:void(0)"><span>2. </span>不认识</a>
                    </div>
                </div>
            </div>
        </div>
    </div>



    </script>
    <script id="review-prompt-tmpl" type="text/x-jquery-tmpl">
        <div class="row prompt">
            <div class="span1"><h6 class="pull-right">状态
                        <small class="question" data-content='
                            <ul>
                                <li>
                                    每个单词当天都会经历自评和测试两个阶段
                                </li>
                                <li>
                                    系统会基于熟悉度在间隔不同天数后再次安排复习；当熟悉度达到7时，即为掌握
                                </li>
                                <li>
                                    如果系统发现你遗忘了某个单词，就会在当天以及后续增加复习次数
                                </li>
                           </ul>'><a href="javascript:;"><i class="icon-question-sign"></i></a></small>
            </h6></div>
            <div class="span9" id="review-prompt-container">
                <div class="well">
                    <div class="prompt-left span4">
                        <ul>
                            <span class="prompt-step1 inactive step">1</span><li class="step_1 prompt-step1 inactive">自评阶段
                            </li>
                            <span class="prompt-step2 inactive step">2</span>
                            <li class="step_2 prompt-step2 inactive">
                                测试阶段
                            </li>
                        </ul>
                    </div>
                    <div class="prompt-right span1 offset1">
                        <span class="title">熟悉度:</span>
                    </div>
                    <div class="prompt-right span3">
                        <div class="progress progress-success"><div class="bar" style="width:${review.retention * 100 /7}%;">${review.retention}</div></div>
                    </div>
                </div>
            </div>
        </div>



    </script>

    <!-- review again test template -->
    <script id="review_again_tmpl" type="text/x-jquery-tmpl">
        <div class="row">
            <div class="span12">

                <div id="learning_word" class="row">
                            <div class="word span10">
                                <div class="row">
                                    <div class="span1"><h6 class="pull-right">&nbsp;</h6></div>
                                    <div class="span9">

                                            <h1 class="content pull-left" style="">{{if syllables}}${syllables}{{else}}${content}{{/if}} <small>{{if pron}}/${pron}/{{/if}}</small></h1>
                                            <span class="hide" id="current-learning-word">${content}</span>

                                        {{if has_audio}}
                                            <div class="pull-left learning-speaker" >
                                                <span class="audio uk">UK<span class="speaker-icon"></span></span>
                                                <span class="audio us">US<span class="speaker-icon"></span></span>
                                            </div>
                                        {{/if}}

                                    </div>
                                </div>

                            </div>
                            <div id="cliparts" class="span2">
                            </div>
                </div>

            </div><!-- Endof herounit-->
        </div>

        <div class="row">
            <div class="span1"><h6 class="pull-right">测试</h6></div>
            <div class="span9" id="answer">
                <h4>
                        选择正确释义：

                </h4>
                <div id="error-msg" class="hide"><span class="label label-important">再来一次</span></div>
                <div id="choices" autocomplete="off" class="">
                    <ul>
                        {{each(i,vocabulary) vocabularies}}
                            <li class="answer">
                                <span class="counter">${i+1}. </span>
                                <input type="radio" name="answer" class="hide" id="${vocabulary.id}" value="${vocabulary.id}"/>
                                <a href="javascript:;" type="definition" style="" class="option" for="${vocabulary.id}">

                                        {{if (G.use_en_test) && (collins && collins.state == 1 || collins.state == 2)}}
                                                {{if (vocabulary.content == review_word)}}
                                                    {{html en_defn_empty}}
                                                {{else}}
                                                    {{html vocabulary.defn_empty}}
                                                {{/if}}
                                        {{else}}
                                                {{if (vocabulary.content == review_word)}}
                                                    ${review_definition}
                                                {{else}}
                                                    ${vocabulary.definition}
                                                {{/if}}
                                        {{/if}}

                                </a>
                            </li>
                        {{/each}}
                            <li class="forget">
                                <span class="forgot-btn counter">0.
                                </span>
                                <span class="">
                                     我忘了
                                </span>
                            </li>
                    </ul>

                        <input id="expect" type='hidden' name='expectation' value='${content_id}' />
                        <input id="review_id" type="hidden" value="${id}"/>
                        <span id="submit-loading" class="loading" style="display:none">&nbsp;</span>
                </div>
            </div>
        </div>





    </script>

    <!-- providing Chinese deifnitions, english definitions, and  examples if possible with the main first letter displayed, spell the word -->
    <!-- word=0, sound=0, cn_def=1, en_def=1,examples.mid=letter, examples.translations=all, answer=1 -->
    <!-- 34 -->
    <script id="review_test_tmpl" type="text/x-jquery-tmpl">
        <div class="row">
            <div class="span12">


        <div class="row">
            <div class="span1"><h6 class="pull-right">单词解释</h6></div>
            <div id="review-definitions" class="span9">
                <div class="well">
                    <div class="row">
                        {{if (collins.state ==1 || collins.state == 2)}}
                            {{if has_en_def}}
                            <div class="span1"><span class="part-of-speech label">${en_definition.pos}</span></div>
                            <ol class="span7">
                                <li class="definition">
                                {{if detail_mode}}
                                    <span class="content">{{html en_defn}}</span>
                                {{else}}
                                    <span class="content">{{html en_defn_empty}}</span>
                                {{/if}}
                                </li>
                            </ol>
                            {{else}}

                            <div class="cndf span7"><span class="text">${definition}</span></div>

                            {{/if}}
                        {{else}}

                                <div class="cndf span7"><span class="text">${definition}</span></div>

                            {{if has_en_def}}
                            {{if review.review_status != 0 && review.review_status != 3}}
                                <a href="javascript:;" id="show_en_df" class="sblink pull-right">英语释义</a>
                            {{/if}}
                            {{/if}}

                        {{/if}}
                    </div>
                    {{if !(collins.state ==1 || collins.state==2)}}
                        {{if mode && mode ==  "explore"}}
                            <div class="endf clear row {{if (default_definition_type != 2) }}hide{{/if}}">
                                {{each(speech, definitions) en_definitions}}
                                     <div class="span1"><span class="part-of-speech label">${speech}</span></div>
                                     <ol class="span7">
                                     {{each(i, def) definitions}}
                                        <li class="definition">
                                            <span class="content">{{html def.replace(/vocab>/g, "span>")}}</span>
                                        </li>
                                    {{/each}}
                                    </ol>
                                {{/each}}
                            </div>
                        {{else}}
                            <div class="endf hide carousel clear slide {{if (default_definition_type != 2) }}hide{{/if}}">
                                <div class="carousel-inner">
                                {{each(speech, definitions) en_definitions}}
                                     {{each(i, def) definitions}}
                                        <div class="definition item span6">
                                            <span class="part-of-speech label">${speech}</span>
                                            <span class="content">${def}</span>
                                        </div>
                                    {{/each}}
                                {{/each}}
                                </div>
                                <a class="carousel-control left" href=".endf" data-slide="prev">&lsaquo;</a>
                                <a class="carousel-control right" href=".endf" data-slide="next">&rsaquo;</a>
                            </div>
                        {{/if}}
                    {{/if}}

                    {{if mode && mode ==  "explore"}}
                    <div class='all-defn'>
                        <div>
                            <a href="javascript:;" class="defn-trigger collins sblink hide">
                                <i class="icon icon-sitemap"></i> 显示全部释义(V)
                            </a>
                            <p class="collins-expired-hint alert hide">
                                <button class="close" type="button">
                                    <span title=不再提醒>&times;</span>
                                </button>
                                用英文学英文（柯林斯高阶精华版）应用已经过期，<a href='/market/app/collins/' target='_blank'>点击这里</a>  去续费或者停用
                            </p>
                        </div>
                        <div class="loading hide">
                            <span>正在获取更多数据 ...</span>
                        </div>
                        <p class="remind alert hide">
                            该单词只有一项释义
                        </p>
                        <ol></ol>
                        {{if collins.code_name == "oxford"}}
                        <p class="nocollins hide">
                        </p>
                        {{/if}}
                        {{if collins.code_name == "collins"}}
                        <p class="nocollins hide">
                            <a href="/market/app/collins/"> 关于柯林斯词典</a>
                        </p>
                        {{/if}}
                    </div>
                    {{/if}}
                </div>
                <div class="modal hide edit-definition-modal">
                    <div class="modal-header">
                        <button class="close" data-dismiss="modal"></button>
                        <h3>正在编辑释义</h3>
                    </div>
                    <div class="modal-body">
                        <textarea id="def-box" class="span7" rows="3" name="definition">${definition}</textarea>
                    </div>
                    <div class="modal-footer">
                        <a href="#" class="btn" data-dismiss="modal">关闭</a>
                        <a href="#" class="btn btn-primary save" data-dismiss="modal">保存</a>
                    </div>
                </div>
            </div>
        </div>


                {{if example}}


{{if (example)}}
    <div class="row">
        <div class="span1"><h6 class="pull-right">例句</h6></div>
        <div id="review-examples" class="span9">
            <div class="well">
                <div class="enex annotation">




                                {{html example.input_first_letter}}



                </div>

                <div class="cnex  ">${example.translation}</div>

            </div>
        </div>
    </div>
{{/if}}

                {{/if}}
                <div class="row">
                    <div class="span9 offset1">
                        <div class="spelling-shortcuts-hint">

                            <p>按 <span>空格键</span> 提交拼写结果或跳至下一个输入框，按 <span>数字键</span><span class="shortcut-key">0</span> 查看提示信息</p>
                            <p class="hide continue-shortcut">按 <span></span> <span class="shortcut-key">字母D</span> 继续，按 <span></span> <span class="shortcut-key">字母i</span> 更正单词</p>

                        </div>
                        <div class="alert alert-info spelling-hint spelling-correct-answer-hint hide">
                            <p>正确答案：<span></span></p>
                        </div>
                        <div class="alert alert-info spelling-hint spelling-one-more-time-hint hide">
                            <p>还不对，请再试一次</p>
                        </div>
                        <div class="alert alert-info spelling-hint spelling-error-hint hide">
                            <p>答案不正确，请再次尝试。</p>
                        </div>
                        <div class="alert alert-info spelling-hint play-audio-hint hide">
                            <p>仔细听单词发音，然后填写单词</p>
                        </div>
                        <div class="alert alert-info spelling-hint consonant-hint hide">
                            <p>提示：这个单词的辅音部分为 <span></span></p>
                        </div>
                        <div class="alert alert-info spelling-hint first-letter-hint hide">
                            <p>提示：这个单词以字母 <span></span> 开头</p>
                        </div>
                        <div class="alert alert-danger spelling-result spelling-result-failed hide">

                                <p>拼写不正确</p>
                                <p>正确答案是：<span class='right-word'></span></p>
                                <p>你的答案是：<span class='wrong-word'></span></p>

                        </div>
                        <div class="alert spelling-result spelling-result-warning hide">

                                <p>单词原形填写正确，但这里最好使用单词的合理变形</p>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="span10">
                <a href="javascript:;" class="hide continue continue-button"></a>
            </div>
        </div>



    </script>

    <!-- checkin -->
    <script type="text/x-jquery-tmpl" id="checkin_button_tmpl">
    </script>
    <script id="roundend_info_tmpl" type="text/x-jquery-tmpl">
        <div class="hero-unit checkin">
            <img src="https://static.baydn.com/static/img/checkin_header.png" id="checkin-header-img" />
            <div class="checkin_days_container row">
                <div class="span7 offset1 checkin_days_content">
                    <div class="row" style="padding-left: 40px;">
                        <h1 class="span2">
                            <small class="big_word">
                                打卡天数
                            </small>
                        <span class="big_number">${num_checkin_days + 1}</span>
                        </h1>
                        <h1 class="span2">
                            <small class="big_word">
                                今日单词
                            </small>
                            <span class="big_number">${num_today}</span>
                        </h1>
                        <h1 class="span2">
                            <small class="big_word">
                                用时
                            </small>
                            <span class="big_number">${used_minutes}</span><span class="unit">分钟</span>
                        </h1>
                    </div>
                </div>
            </div>
            <hr>
            <div class="checkin_tip_container row">
                <div class="span8 offset1">
                        <h3>打卡表示你已经完成当天所布置的任务，并且可以简要记录你的所思所想。</h3>
                        <br />
                        <h4>完成打卡后你将获得贝壳作为奖励。</h4>
                </div>
            </div>
            <hr>
            <div class="checkin_user_note_container row">
                <div class="span6 offset1">
                    <form action="" method="POST">
                        <input class="hide" id="pray-for-shanbay-lady" type="checkbox" value=扇贝女神></input>
                        <textarea class="input-xlarge user-note span8" rows="4" placeholder="安全起见，请不要在打卡里透露自己的姓名，年龄，地址等个人隐私"></textarea>
                        <br/>
                        <button href="javascript:;" class="checkin-button span3 offset2" id="checkin_button">打卡</button>
                    </form>
                </div>
            </div>
        </div>



    </script>

    <script id="checkin_content_tmpl" type="text/x-jquery-tmpl">
        <div class="hero-unit">
            <div class="page-header">

            <p class="default-checkin-note">今天在扇贝网上学习了<span class="highlight bold">${num_today}</span> 个单词, 累计打卡<span class="highlight bold">${checkin_days}</span> 天。</span></p>

                <p class="checkin-award-note">
                    收到了 ${daily_value} 彩贝作为今日奖励
                    {{if (accumulated_value >0)}}
                        以及 ${accumulated_value} 彩贝作为连续 ${checks} 天打卡奖励
                    {{/if}}
                </p>
            </div>
            <div class="avatar span" id="user-checkin-note-avatar">
                <img src="https://media-image1.baydn.com/people%2Favatar%2Fe615d20d7f2fb3d604c2f8ecf0c49aff.png@60w_60h"  width="60" height="60" class="None"/>
            </div>
            <div class="user-checkin-note-container">
                <div class="user-checkin-note-text">

 <p class="user-checkin-note-container"> <span class="user-checkin-note">${user_note}</span></p>
                </div>
                <div class="user-checkin-note-angle diamond">
                </div>
            </div>
            <div class="nav-for-further-explore">
                <a class="btn" href="/review/examples">例句温习</a>
                <a class="btn" href="/read/home/">开始阅读</a>
                <a class="btn" href="/forum/">去论坛</a>
                <a class="btn" href="/footprints/">去周刊</a>
            </div>
        </div>



    </script>
    <!-- No Sound Help -->
    <script id="review-nosound-tmpl" type="text/x-jquery-tmpl">
        <div class="modal hide review-nosound-modal">
          <div class="modal-header">
            <button class="close" data-dismiss="modal"></button>
            <h3>&nbsp;</h3>
          </div>
          <div class="modal-body">
            <div id="review-nosound">
                {{if !flash_installed}}
                    <p> 你的浏览器没有安装Adobe Flash Player，无法播放声音
                        <a id="install-info" class="button" href="">这里</a>
                        更多
                    </p>
                {{else}}
                    <p> 你已经安装了Flash插件，但是你的电脑系统可能有问题，导致无法播放声音</p>
                    <p>了解无法发音的原因，请点击
                        <a id="nosound-reason" class="button" href="/help/faq/no_voice/">这里</a>
                    </p>
                {{/if}}
                    <p> 你可以临时禁用听写模式，改用其他测试方式</p>
                    <a id="temp" class="button" href="javascript:void(0)"> 禁用听写 </a>
                     <p>
                        你也可以永久禁用听写，
                        只需要点击
                        <a id="perm" class="button" href="/bdc/setting/">这里</a>
                        进入设置页面，关闭自动播放单词发音
                    </p>
            </div>

          </div>
          <div class="modal-footer">
            <a href="#" class="btn btn-primary ok" data-dismiss="modal">I see</a>
          </div>
        </div>



    </script>
    <!-- start review -->
    <script id="is-new-user-tmpl" type="text/x-jquery-tmpl">
        <p>您刚开始使用扇贝网，您的每日学习量将在接下来几天的学习过程中，逐渐增加至 ${quota} 个每天</p>



    </script>
    <script id="start-review-tmpl" type="text/x-jquery-tmpl">
        <div class="row bdc-learning-header">
            <div class="span12">
                <p>
                    <span class="span-left">&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;</span>
                    扇贝单词
                    <span class="span-right">&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;&#8901;</span>
                </p>
            </div>
        </div>
        <div class="hero-unit start-review new-start-review">
            <div class="row new-review-summary">
                <div class="pull-left span7">
                    <h1 class="span2 today">${num_today}<small>今日单词</small></h1>
                    <h1 class="span2">${num_new}<small>新词</small></h1>
                </div>
                <div class="span3">
                    <div class="row-fluid">
                        <button class="span12 btn-large btn-success start-review-button">开始学习</button>
                    </div>
                    <div class="row-fluid">
                        <div id="start-review-button-loading" class="hide" style="text-align: center; padding-top: 30px;">
                            <img src="https://static.baydn.com/static/img/loading.gif" width=20 />
                        </div>
                    </div>
                </div>
            </div>
        </div>
		<div class="quote" id="quote">
			<blockquote>
				<p></p>
				<small></small>
			</blockquote>
		</div>



    </script>
    <script type="text/javascript">
        // window.addEventListener("load", function (event) {
        //     // $.ajax({
        //     //     url: "https://rest.shanbay.com/api/v2/quote/quotes/today/",
        //     //     success: function (res) {
        //     //         var quote = res.data;
        //     //         $("#quote p").text(quote.content).append("<br />").append(quote.translation);
        //     //         $("#quote small").text(quote.author);
        //     //         var note = $("#quote").html();
        //     //
        //     //         var $checkinNote = $(".checkin-note");
        //     //         var needUpdateQuote
        //     //             = !$checkinNote.html() // 不存在内容
        //     //             || $checkinNote.children().length // 存在层级内容（已有每日一句）
        //     //
        //     //         if (needUpdateQuote) {
        //     //             $checkinNote.html(note);
        //     //         }
        //     //     }
        //     // });
        // });
    </script>
    <script id="overview-tmpl" type="text/x-jquery-tmpl">
        <img src="https://static.baydn.com/static/img/checkin_header.png" id="checkin-header-img" class="overview-checkin-header-img"/>
        <div class="hero-unit overview start-review {{if num_today==0}}zero-words-review{{/if}}">
            {{if num_today==0}}
                <div class="margin: auto;">
                    <div style="text-align: center;">
                        <img width="200" src="http://qstatic.shanbay.com/media/media_store/c49e7c031e62434d3bf53f5b01234af4.png" />
                        <p>你今天没有背单词任务</p>
                    </div>
                </div>
            {{/if}}
            <div class="row">
                {{if num_today==0}}
                    <div class="span12">
                        <div class="row options-container">
                            <a class="btn btn-success span3" href="/wordbook/books/mine/">添加单词书</a>
                            <a class="btn btn-success span3" href="/read/home/">去阅读</a>
                            <a class="btn btn-success span3" href="/sentence/review/">去炼句</a>
                        </div>
                    </div>
                {{else}}
                    <div class="span6">
                        <div class="row">
                            <h1 class="span2 first"><small>今日单词</small>${num_today}</h1>
                            <h1 class="span2"><small>新词</small>${num_new}</h1>
                            <h1 class="span2"><small>用时</small>${used_minutes}<span class="unit">分钟</span></h1>
                        </div>
                        <div class="row task-done">
                            <h2 class="">今日单词任务已完成</h2>
                        </div>
                    </div>
                    <div class="span4 btn-group">
                        <div class="row">
                            <h2 class=""><small>接下来你可以：</small></h2>
                        </div>
                        <br>
                        <div class="row">
                            <div class="btn-group">
                                <button class="white-btn-large-left disabled review-new-button">
                                    测试新词
                                </button><button class="white-btn-large-right review-again-button">
                                    测试全部单词
                                </button>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="btn-group">
                                <a class="white-btn-large-left review-examples" href="/bdc/review/examples">例句测试</a><a class="white-btn-large-right" href="/bdc/spotcheck/" target="_blank" >单词抽查</a>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="btn-group">
                                <a class="white-btn-large-left go-to-checkin-button" href="/" style="font-weight: bold;">去打卡！</a>
                            </div>
                        </div>
                    </div>
                {{/if}}
            </div>
            <div class="row">
            </div>
        </div>


<hr style="height:2px;background-color:#EEE;"/>
        <div class="promotion">
            <div class="row">
                <div class="span6">
                    <span class="title">扇贝单词</span>
                </div>
                <div class="span6">
                    <span class="title">扇贝阅读</span>
                </div>
            </div>
            <div class="row">
                <div class="span6">
                    <div class="row">
                    <div class="span3">
                        <a href="https://itunes.apple.com/cn/app/shan-bei-dan-ci/id531059691" target="_blank">
                            <img src="https://static.baydn.com/static/img/review/icon_iphone.png" />
                            <span class="subtitle">iPHONE 下载</span>
                        </a>
                    </div>
                    <div class="span3">
                        <a href="/m/intro/" target="_blank">
                            <img src="https://static.baydn.com/static/img/review/icon_android.png" />
                            <span class="subtitle">ANDROID 下载</span>
                        </a>
                    </div>
                    </div>
                </div>
                <div class="span6">
                    <div class="row">
                    <div class="span3">
                        <a href="https://itunes.apple.com/cn/app/shan-bei-xin-wen/id598541783" target="_blank">
                            <img src="https://static.baydn.com/static/img/icon_shanbaynews.png" />
                            <span class="subtitle">扇贝新闻</span>
                        </a>
                    </div>
                    <div class="span3">
                        <a href="/read/plan/" target="_blank">
                            <img src="https://static.baydn.com/static/img/review/icon_readplan.png" />
                            <span class="subtitle">短文计划</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>




    </script>

    <script id="review-tests-tmpl" type="text/x-jquery-tmpl">
        <div class="span8 main" id="summary-box">
            <p class="title">单词小结</p>
            <p class="test-hint">

                    点击句子，选择合适的单词填空。<br />
                    按<span>数字键</span>快速选择对应的句子，然后按<span>字母键</span>选择答案

                <i class="icon-remove remove-hint"></i>
            </p>
            <p class="answer-hint hide">
                绿色表示答案正确，你可以修改标红的句子或继续学习。
                <i class="icon-remove remove-hint"></i>
            </p>

            {{each(index,word) words}}
                <div id="summary-${id}" class="question" data-sequence="${index}">
                    ${index+1}.
                    {{html examples.annotation_empty}}

                    <div class="hide progress progress-success"><div class="bar" style="width:${retention*100/7}%"></div></div>
                    <div class="hide meaning">
                        <p>${examples.translation}</p>
                        <p>${content}:&nbsp${definition}</p>
                        <p class="operation"><span data-id="${id}" class="summary-icon-list"></span></p>
                    </div>
                    <div class="review-setting"></div>
                </div>
            {{/each}}

            <a href="javascript:;" class="hide continue continue-button tests-end"></a>
        </div>



    </script>

    <script id="options-tmpl" type="text/x-jquery-tmpl">
        <table class="options">
        {{each(index,option) options}}
            {{if index%3==0}}
                <tr>
            {{/if}}
            <td class="option
                {{if option_index == index}}
                    chosen
                {{/if}}
                {{if selected[index]>0}}
                    selected
                {{/if}}
            " data-sequence="${index}">
                ${String.fromCharCode(65 + index)}.
                <span>${option}</span>
            </td>
            {{if index%3==2}}
                </tr>
            {{else}}
                {{if index==options.length-1}}
                    {{if index%3==0}}
                        <td></td>
                        <td></td>
                    {{else}}
                        <td></td>
                    {{/if}}
                    </tr>
                {{/if}}
            {{/if}}
        {{/each}}
        </table>



    </script>


</div><!-- /container -->


<div id="bloxyModal" class="modal fade hide">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">网络错误!</h4>
            </div>
            <div class="modal-body">
                <p>您的电脑上安装了某些视频广告拦截软件，这会导致无法提交学习数据。</p>
                <p> 您可以退出相应软件后刷新网页继续学习。</p>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div> <!-- .modal -->

<div class="modal hide shortcuts-modal">
    <div class="modal-header">
        <button class="close" data-dismiss="modal"></button>
        <h3>快捷键</h3>
    </div>
    <div class="modal-body">
        <table>
            <tbody>
            <tr>
                <th>下个单词</th>
                <td>大于号&gt;或右方向键或D键</td>
            </tr>
            <tr>
                <th>提交答案</th>
                <td>回车键</td>
            </tr>
            <tr>
                <th>选择相应选项</th>
                <td>数字键0到4，0为忘记</td>
            </tr>
            <tr>
                <th>拼写单词</th>
                <td>S 键</td>
            </tr>
            <tr>
                <th>单词发音</th>
                <td>P 键</td>
            </tr>
            <tr>
                <th>显示词根详情（需购买智慧词根应用）</th>
                <td>R 键</td>
            </tr>
            <tr>
                <th>显示派生词信息（需购买派生词应用）</th>
                <td>F 键</td>
            </tr>
            <tr>
                <th>认识</th>
                <td>数字键 1</td>
            </tr>
            <tr>
                <th>不认识</th>
                <td>数字键 2</td>
            </tr>
            <tr>
                <th>忘记</th>
                <td>数字键 0</td>
            </tr>
            <tr>
                <th>太简单</th>
                <td>数字键 9</td>
            </tr>
            <tr>
                <th>关闭对话框</th>
                <td>Esc 键</td>
            </tr>
            </tbody>
        </table>

    </div>
    <div class="modal-footer">
        <a href="#" class="btn" data-dismiss="modal">关闭</a>
    </div>
</div>











</body>
</html>