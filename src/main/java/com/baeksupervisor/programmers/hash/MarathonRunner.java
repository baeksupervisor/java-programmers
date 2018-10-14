package com.baeksupervisor.programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * <b>문제 설명</b><br/>
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.<br/>
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * </pre>
 *
 * <b>제한사항</b><br/>
 * <ul>
 * <li>마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.</li>
 * <li>completion의 길이는 participant의 길이보다 1 작습니다.</li>
 * <li>참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.</li>
 * <li>참가자 중에는 동명이인이 있을 수 있습니다.</li>
 * </ul>
 *
 * @author wilson
 * @version 1.0
 * @since 2018. 10. 14.
 */
public class MarathonRunner {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> mapOfParticipant = new HashMap<>();
        for (int i=0, len=participant.length ; i<len ; i++) {
            String key = participant[i];
            if (mapOfParticipant.containsKey(key)) {
                mapOfParticipant.put(key, mapOfParticipant.get(key) + 1);
            } else {
                mapOfParticipant.put(key, 1);
            }
        }

        for (int i=0, len=completion.length ; i<len ; i++) {
            String key = completion[i];
            if (mapOfParticipant.containsKey(key)) {
                Integer val = mapOfParticipant.get(key);
                if (val > 1) {
                    mapOfParticipant.put(key, val-1);
                } else {
                    mapOfParticipant.remove(key);
                }
            }
        }

        answer = mapOfParticipant.keySet().stream().findFirst().get();

        return answer;
    }
}