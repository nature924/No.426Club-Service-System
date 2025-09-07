import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zhuangjizixun from '@/views/modules/zhuangjizixun/list'
    import news from '@/views/modules/news/list'
    import discusswangluotaocan from '@/views/modules/discusswangluotaocan/list'
    import wangluotaocan from '@/views/modules/wangluotaocan/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import zixunhuifu from '@/views/modules/zixunhuifu/list'
    import discussruanjiandaquan from '@/views/modules/discussruanjiandaquan/list'
    import shetuanrenyuan from '@/views/modules/shetuanrenyuan/list'
    import wangluobaoxiu from '@/views/modules/wangluobaoxiu/list'
    import config from '@/views/modules/config/list'
    import ruanjiandaquan from '@/views/modules/ruanjiandaquan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zhuangjizixun',
        name: '装机咨询',
        component: zhuangjizixun
      }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/discusswangluotaocan',
        name: '网络套餐评论',
        component: discusswangluotaocan
      }
      ,{
	path: '/wangluotaocan',
        name: '网络套餐',
        component: wangluotaocan
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/zixunhuifu',
        name: '咨询回复',
        component: zixunhuifu
      }
      ,{
	path: '/discussruanjiandaquan',
        name: '软件大全评论',
        component: discussruanjiandaquan
      }
      ,{
	path: '/shetuanrenyuan',
        name: '社团人员',
        component: shetuanrenyuan
      }
      ,{
	path: '/wangluobaoxiu',
        name: '网络报修',
        component: wangluobaoxiu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/ruanjiandaquan',
        name: '软件大全',
        component: ruanjiandaquan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
