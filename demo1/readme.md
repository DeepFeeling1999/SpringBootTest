

@Controller
表明是一个控制器类，使其注入spring容器

@RequestMapping
用在类上的话，相当于根目录，用在方法上的话，相当于细分子目录

@RequestMapping可以通过参数指定http请求的方法类型
如：这样会根据/home路径请求的具体http方法而做不同的映射
@RestController  
@RequestMapping("/home")  
public class IndexController {  
    @RequestMapping(method = RequestMethod.GET)  
    String get() {
        return "Hello from get";  
    }
    @RequestMapping(method = RequestMethod.POST)  
    String post() {  
        return "Hello from post";  
    }
}

@RequestMapping
还可以指定url，请求方法，请求参数和请求头


@ResponseBody
表示返回值以json格式直接返回，不会被解析为url

@RestController = @ResponseBody + @Controller
