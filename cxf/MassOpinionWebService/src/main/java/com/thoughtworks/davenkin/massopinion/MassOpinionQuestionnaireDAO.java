package com.thoughtworks.davenkin.massopinion;

import java.util.ArrayList;

public interface MassOpinionQuestionnaireDAO
{
//    public List<Questionnaire> getQuestionnaires();

    Questionnaire getQuestionnaireById(String id);

    ArrayList<Questionnaire> getQuestionnaires();
}
