import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import HelloWorld from '@/components/HelloWorld'
import addProdPage from '@/components/addProduct'
import showOrderPage from '@/components/showOrder'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/Hello',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/addProd',
      name: 'addProdPage',
      component: addProdPage
    },
    {
      path: '/showOrder',
      name: 'showOrderPage',
      component: showOrderPage
    },
  ]
})
