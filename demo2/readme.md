

#yml配置
environments:
    dev:
        url=http://dev.bar.com
        name=Developer Setup
    prod:
        url=http://foo.bar.com
        name=My Cool App
与其等价的properties配置：
environments.dev.url=http://dev.bar.com
environments.dev.name=Developer Setup
environments.prod.url=http://foo.bar.com
environments.prod.name=My Cool App


还可以通过spring.profiles来定义不同环境的配置


还可以在spring boot配置文件中预设配置属性：
mysql:
    name: root
    password: 123456

/**
* 通过配置文件注入预设的值
*/
@Value("${mysql.name}")
private String name;






