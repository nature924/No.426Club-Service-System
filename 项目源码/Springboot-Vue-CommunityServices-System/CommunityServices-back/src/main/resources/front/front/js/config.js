
var projectName = '社团服务系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '软件大全',
	url: './pages/ruanjiandaquan/list.html'
}, 
{
	name: '网络套餐',
	url: './pages/wangluotaocan/list.html'
}, 

{
	name: '系统公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot48zml/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"社团人员","menuJump":"列表","tableName":"shetuanrenyuan"}],"menu":"社团人员管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除","查看评论"],"menu":"软件大全","menuJump":"列表","tableName":"ruanjiandaquan"}],"menu":"软件大全管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","修改","删除"],"menu":"网络报修","menuJump":"列表","tableName":"wangluobaoxiu"}],"menu":"网络报修管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"装机咨询","menuJump":"列表","tableName":"zhuangjizixun"}],"menu":"装机咨询管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除"],"menu":"咨询回复","menuJump":"列表","tableName":"zixunhuifu"}],"menu":"咨询回复管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除","查看评论"],"menu":"网络套餐","menuJump":"列表","tableName":"wangluotaocan"}],"menu":"网络套餐管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"},{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","查看评论"],"menu":"软件大全列表","menuJump":"列表","tableName":"ruanjiandaquan"}],"menu":"软件大全模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","查看评论"],"menu":"网络套餐列表","menuJump":"列表","tableName":"wangluotaocan"}],"menu":"网络套餐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","修改","删除","新增"],"menu":"网络报修","menuJump":"列表","tableName":"wangluobaoxiu"}],"menu":"网络报修管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"装机咨询","menuJump":"列表","tableName":"zhuangjizixun"}],"menu":"装机咨询管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"咨询回复","menuJump":"列表","tableName":"zixunhuifu"}],"menu":"咨询回复管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","查看评论"],"menu":"软件大全列表","menuJump":"列表","tableName":"ruanjiandaquan"}],"menu":"软件大全模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","查看评论"],"menu":"网络套餐列表","menuJump":"列表","tableName":"wangluotaocan"}],"menu":"网络套餐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","删除","审核"],"menu":"网络报修","menuJump":"列表","tableName":"wangluobaoxiu"}],"menu":"网络报修管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","咨询回复","删除"],"menu":"装机咨询","menuJump":"列表","tableName":"zhuangjizixun"}],"menu":"装机咨询管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除"],"menu":"咨询回复","menuJump":"列表","tableName":"zixunhuifu"}],"menu":"咨询回复管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","查看评论"],"menu":"软件大全列表","menuJump":"列表","tableName":"ruanjiandaquan"}],"menu":"软件大全模块"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","查看评论"],"menu":"网络套餐列表","menuJump":"列表","tableName":"wangluotaocan"}],"menu":"网络套餐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"社团人员","tableName":"shetuanrenyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
