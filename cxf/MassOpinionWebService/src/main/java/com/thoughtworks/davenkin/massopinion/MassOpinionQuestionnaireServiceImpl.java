package com.thoughtworks.davenkin.massopinion;

import java.util.List;

public class MassOpinionQuestionnaireServiceImpl implements MassOpinionQuestionnaireService
{
    MassOpinionQuestionnaireDAO massOpinionQuestionnaireDAO;

    public MassOpinionQuestionnaireServiceImpl(MassOpinionQuestionnaireDAO massOpinionQuestionnaireDAO)
    {
        this.massOpinionQuestionnaireDAO = massOpinionQuestionnaireDAO;
    }

    public List<Questionnaire> getQuestionnaires()
    {
       return massOpinionQuestionnaireDAO.getQuestionnaires();
    }
}
