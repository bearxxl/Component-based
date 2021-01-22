# 组件化实现步骤
## 1. project同级别目录下新建自定义gradle

    参考：xxl.gradle


## 2. 最外层project级别gradle引用该自定义gradle文件

    参考：apply from: 'xxl.gradle'

## 3. 定义isRelease参数，根据该参数配置module的gradle是application级别还是plugin级别,并动态配置applicationid

    参考： login 模块
    if (isRelase) {
       apply plugin: 'com.android.library'
    } else {
       apply plugin: 'com.android.application'
     }
   
    if(!isRelase){
               applicationId appId.businessId
## 4. app模块添加动态依赖

    if (isRelase) {
        implementation project(':login')
        implementation project(':business')
    }
## 5. 通过修改isRelease编译整个项目或者单个module
               
