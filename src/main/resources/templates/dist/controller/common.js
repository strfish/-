layui.define(function(e){var i=(layui.$,layui.layer,layui.laytpl,layui.setter,layui.view,layui.admin);i.events.logout=function(){i.req({url:"./json/user/logout.js",type:"get",data:{},done:function(e){i.exit()}})},e("common",{})});