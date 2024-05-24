<template>
    <el-form class="login-container" label-position="left" label-width="0px">
      <h3 class="login_title">新增訂單</h3>
      
    </el-form>
  </template>

  <script>
  import request from '../utils/request';

  
  export default {
    name: 'showOrderPage',
    created(){
      request.get("/findProduct")
      .then(res => {
        console.log(res);
      }).catch(err => {
        console.log(err);
      })
    }
  }
  </script>
  
  <style>
  
body {
  margin: 0px;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 90px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}

.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #505458;
}
  </style>
  