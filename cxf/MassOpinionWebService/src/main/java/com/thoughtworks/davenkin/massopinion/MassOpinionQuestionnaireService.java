package com.thoughtworks.davenkin.massopinion;

import javax.jws.WebService;
import java.util.ArrayList;


@WebService
public interface MassOpinionQuestionnaireService
{
    public Questionnaire getQuestionnaireById(String id);
    public ArrayList<Questionnaire> getQuestionnaire();
}


