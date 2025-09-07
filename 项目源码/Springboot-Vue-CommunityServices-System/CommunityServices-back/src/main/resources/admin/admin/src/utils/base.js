const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot48zml/",
            name: "springboot48zml",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot48zml/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社团服务系统"
        } 
    }
}
export default base
