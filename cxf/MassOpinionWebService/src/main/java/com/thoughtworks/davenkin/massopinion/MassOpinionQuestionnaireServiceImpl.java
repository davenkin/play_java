package com.thoughtworks.davenkin.massopinion;

import java.util.ArrayList;

public class MassOpinionQuestionnaireServiceImpl implements MassOpinionQuestionnaireService
{
    MassOpinionQuestionnaireDAO massOpinionQuestionnaireDAO;

    public MassOpinionQuestionnaireServiceImpl(MassOpinionQuestionnaireDAO massOpinionQuestionnaireDAO)
    {
        this.massOpinionQuestionnaireDAO = massOpinionQuestionnaireDAO;
    }


    public Questionnaire getQuestionnaireById(String id)
    {
        return massOpinionQuestionnaireDAO.getQuestionnaireById(id);
    }

    public ArrayList<Questionnaire> getQuestionnaire()
    {
        return massOpinionQuestionnaireDAO.getQuestionnaires();
    }
}
