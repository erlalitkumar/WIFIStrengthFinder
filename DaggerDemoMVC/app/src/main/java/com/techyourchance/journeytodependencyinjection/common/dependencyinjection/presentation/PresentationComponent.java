package com.techyourchance.journeytodependencyinjection.common.dependencyinjection.presentation;

import com.techyourchance.journeytodependencyinjection.questions.FetchQuestionDetailsUseCase;
import com.techyourchance.journeytodependencyinjection.questions.FetchQuestionsListUseCase;
import com.techyourchance.journeytodependencyinjection.screens.common.dialogs.DialogsManager;
import com.techyourchance.journeytodependencyinjection.screens.common.mvcviews.ViewMvcFactory;

import dagger.Component;

@Component(modules = PresentationModule.class)
public interface PresentationComponent {
public DialogsManager getDialogsManager();
public ViewMvcFactory getViewMvcFactory();
public FetchQuestionsListUseCase getFetchQuestionsListUseCase();
public FetchQuestionDetailsUseCase getFetchQuestionDetailsUseCase();
}
