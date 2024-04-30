package voteApplicationUsingPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class VoteTest {
    public static void main(String[] args) {

        VoterInfo voterDetails1= new VoterInfo();
        voterDetails1.setVoterId("TS2345");
        voterDetails1.setVoteStatus("No");

        VoterInfo voterDetails2= new VoterInfo();
        voterDetails2.setVoterId("TS2346");
        voterDetails2.setVoteStatus("No");

        VoterInfo voterDetails3= new VoterInfo();
        voterDetails3.setVoterId("TS2347");
        voterDetails3.setVoteStatus("No");

        VoterInfo voterDetails4= new VoterInfo();
        voterDetails4.setVoterId("TS2348");
        voterDetails4.setVoteStatus("No");

        List<VoterInfo>voterInfoList= new ArrayList<>();
        voterInfoList.add(voterDetails1);
        voterInfoList.add(voterDetails2);
        voterInfoList.add(voterDetails3);
        voterInfoList.add(voterDetails4);
        voterInfoList.add(voterDetails1);

        Predicate<VoterInfo> voteVerification =(voterDetails)->voterDetails.getVoteStatus().equals("Yes");
        Predicate<VoterInfo>voteVerification1=(voterDetails)->voterDetails.getVoteStatus().equals("No");

VoteService voteService= new VoteService();
voteService.getVoteStatus(voterInfoList,voteVerification,voteVerification1);




    }
}
