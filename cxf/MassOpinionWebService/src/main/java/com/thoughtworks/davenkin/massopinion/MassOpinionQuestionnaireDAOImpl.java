package com.thoughtworks.davenkin.massopinion;

import java.util.ArrayList;

public class MassOpinionQuestionnaireDAOImpl implements MassOpinionQuestionnaireDAO
{
    public ArrayList<Questionnaire> getQuestionnaires()
    {
        ArrayList<Questionnaire> questionnaires = new ArrayList<Questionnaire>();
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

    public Questionnaire getQuestionnaireById(String id)
    {
        //        questionnaire.addOption("Java");
//        questionnaire.addOption("C#");
//        questionnaire.addOption("Ruby");
        return new Questionnaire("What language have you ever been using?");
    }
}
