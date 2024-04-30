package voteApplicationUsingPredicate;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class VoteService {

    public void getVoteStatus(List<VoterInfo>voterInfoList ,Predicate<VoterInfo>predicate,
                              Predicate<VoterInfo>predicate1){
        Iterator<VoterInfo> itr=voterInfoList.iterator();

        for(;itr.hasNext();){
            VoterInfo voterInfo= itr.next();
                if (predicate.test(voterInfo)) {

                    System.out.println("You are already casted your vote:  " +
                            "  voterId  " + voterInfo.getVoterId());
                }
            if(predicate1.test(voterInfo)) {
                voterInfo.setVoteStatus("Yes");
                System.out.println("you are eligible to caste your vote  "  + " voterId "+
                        voterInfo.getVoterId());
            }







            }

        }
    }

