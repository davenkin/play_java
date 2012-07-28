package com.thoughtworks.davenkin.massopinion;

import java.util.ArrayList;
import java.util.List;

public class MassOpinionQuestionnaireDAOImpl implements MassOpinionQuestionnaireDAO
{
    public List<Questionnaire> getQuestionnaires()
    {
        List<Questionnaire> questionnaires = new ArrayList<Questionnaire>();
        Questionnaire questionnaire = new Questionnaire("What language have you ever been using?");
        questionnaire.addOption("Java");
        questionnaire.addOption("C#");
        questionnaire.addOption("Ruby");
        questionnaires.add(questionnaire);
        
        Questionnaire questionnaire1 = new Questionnaire("Do you like programming?");
        questionnaire1.addOption("Yes");
        questionnaire1.addOption("No");
        questionnaires.add(questionnaire1);
        
        return questionnaires;
    }
}
