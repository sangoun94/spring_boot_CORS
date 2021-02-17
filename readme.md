cors server TEST

CORS -> SOP를 우회해서 사용하는 놈이다

표준


CORS는 다른 client에 Origin 정보가 달라도 (스키마, hostname, port)
불러와서 사용할 수 있는 놈이다.

8080 서버를 켜 두고 8070을 쳤는데 8070이 된다는 마법같은 이야기.

WebConfig implements WebMvcConfiguration 에서

     @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // 모든 mapping(주소- /hello)에 8070의 ajax가 나온다.
                .allowedOrigins("http://localhost:8070");
    }

이것을 사용하도록 하자.




@CrossOrigin도 가능하다.  그치만 한 곳에서 config해준게 좋기에 상단의 내용이 더 좋아보인다.

    @CrossOrigin(origins="http://localhost:8070")     //hello 맵핑된 hello를 반환한다.
	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
	public static void main(String[] args) {

		SpringApplication.run(CorsApplication.class, args);
	}