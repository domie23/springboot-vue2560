const base = {
    get() {
        return {
            url : "http://localhost:8080/yiyuanjiaohu/",
            name: "yiyuanjiaohu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yiyuanjiaohu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院交互系统"
        } 
    }
}
export default base
