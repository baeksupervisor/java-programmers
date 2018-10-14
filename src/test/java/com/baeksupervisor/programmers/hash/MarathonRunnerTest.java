package com.baeksupervisor.programmers.hash;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wilson
 * @version 1.0
 * @since 2018. 10. 14.
 */
public class MarathonRunnerTest {

    private String[] participant;
    private String[] completion;
    private String answer;

    @Before
    public void before() {
//        participant = new String[]{"leo", "kiki", "eden"};
//        completion = new String[]{"eden", "kiki"};

//        participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
//        completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"stanko", "ana", "mislav"};
    }

    @Test
    public void test() {
        MarathonRunner marathonRunner = new MarathonRunner();
        answer = marathonRunner.solution(participant, completion);
    }

    @After
    public void after() {
        System.out.println("\""+answer+"\"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.");
    }
}