package com.thoughtworks.davenkin.massopinion;

import javax.jws.WebService;
import java.util.List;


@WebService
public interface MassOpinionQuestionnaireService
{
    public List<Questionnaire> getQuestionnaires();
}


