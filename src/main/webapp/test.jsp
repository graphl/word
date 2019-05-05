<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/lovetime-WeAdmin-master/WeAdmin/lib/layui/css/layui.css" media="all">
    <script src="/lovetime-WeAdmin-master/WeAdmin/lib/layui/layui.js" charset="utf-8"></script>
</head>
<style>

    .se2{
        width:100px;
        height:36px;
        position:absolute;
        top:338px;
        left:942px;
        z-index: 1;
        opacity: 0;
    }
    .se1{
        width:100px;
        height:36px;
        font-size:16px;
        color:#fff;
        background: #28abde;
        border-radius:5px;
        position:absolute;
        top:338px;
        left:942px;
    }
    .se1:hover{
        cursor: pointer;
    }

</style>
<body>



<div class="weadmin-body">
    <form class="layui-form" id="myForm">
        <div class="layui-form-item">
            <label for="wordName" class="layui-form-label">
                <span class="we-red">*</span>单词
            </label>
            <div class="layui-input-inline">
                <input type="text" id="wordName" name="wordName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
                <span class="we-red">*</span>单词发音地址
            </label>
            <%--<button type="button" class="layui-btn layui-btn-normal" id="test8">选择文件</button>--%>
            <input type="file" class="layui-btn layui-btn-normal" id="wordSound">
        </div>
        <div class="layui-form-item">
            <label for="word" class="layui-form-label">
                <span class="we-red">*</span>单词中文意思
            </label>
            <div class="layui-input-inline">
                <input type="text" id="word" name="word" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="we-red">*</span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="wordSymbol" class="layui-form-label">
                <span class="we-red">*</span>单词音标
            </label>
            <div class="layui-input-inline">
                <input type="text" id="wordSymbol" name="wordSymbol" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="we-red">*</span>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <button  class="layui-btn" lay-filter="add" onclick="onc()">增加</button>
        </div>
    </form>
</div>



<script src="jquery/jquery-3.3.1.min.js"></script>
<script>

    function ontest9(){
        var  file = $("#wordSound")[0].files[0];
      /*  confirm("123"+file.name)*/
     /*   var wordname = $("#wordName").val();*/
        var formdata = new FormData();
        if(document.getElementById("wordSound").value != null )
        {
            formdata.append("file",file);
        }
        else{
            var file1 = new File();
            formdata.append("file",file1);

        }
        formdata.append("wordName",$("#wordName").val());
        formdata.append("word",$("#word").val());
        formdata.append("wordSymbol",$("#wordSymbol").val());
        alert("kaishile")
      /*  formdata.append("wordName",wordname);*/
       /* $.ajax({
            type:'post'
            ,url:'/upload.do'
            ,data:formdata
            ,success:function (data) {
                alert('成功')
                console.log('成功')
            }
            ,error:function (data) {
                alert('失败')
                console.log('失败')
            }
        })*/
      /* var xhr = new XMLHttpRequest();
       xhr.open('post','upload.do');
       xhr.send(formdata)
        return false;*/
      $.ajax({
          url:'/upload.do'
          ,type:'post'
          ,data:formdata
          ,processData:false
          ,contentType:false
          ,success:function (res) {
              alert('成功')
          }
      })
    }

    function  onc(){
        console.log('123')
        ontest9();
    }
    layui.use('upload', function() {
        var $ = layui.jquery
            , upload = layui.upload;


      /*  upload.render({
            elem: '#test8'
          /!*  , url: 'upload.do'*!/
            ,data:{wordName:function () {
                    return $("#wordName").val();
                }}
            , auto: false
            //,multiple: true
  /!*          , bindAction: '#test9'*!/
            , done: function (res) {
                console.log(res)
            }
        });*/
    });
</script>
</body>
</html>
