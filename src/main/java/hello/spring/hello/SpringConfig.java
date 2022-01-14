package hello.spring.hello;

import hello.spring.hello.repository.MemberRepository;
import hello.spring.hello.repository.MemoryMemberRepository;
import hello.spring.hello.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
