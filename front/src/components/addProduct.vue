<template>
    <el-form class="login-container" label-position="left" label-width="0px">
      <h3 class="login_title">新增產品</h3>
      <el-form-item>
        <el-input type="text" v-model="addProd.prodName" 
          auto-complete="off" placeholder="請輸入商品名稱"/>
        <el-input type="number" v-model="addProd.prodPrice"
          auto-complete="off" placeholder="請輸入售價" />
        <el-input type="number" v-model="addProd.prodQuantity"
          auto-complete="off" placeholder="請輸入庫存量" />
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button @click="submit" type="primary" style="width: 100%;  border: none" >新增</el-button>
      </el-form-item>
    </el-form>
  </template>

  <script>
  import request from '../utils/request';
  import axios from 'axios';

  export function addProd(){
    
  }
  
  export default {
    name: 'addProdPage',
    data() {
      return {
        addProd:{
        }
      }
    },

    methods: {

    submit(){
      request({
        url:'/addProduct',
        methods: 'post',
        data: {
          prodName: 'a',
          prodPrice: 2,
          prodQuantity: 2
        }
      })
  }
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
  