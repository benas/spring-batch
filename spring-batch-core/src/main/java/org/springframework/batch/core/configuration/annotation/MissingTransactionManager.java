package org.springframework.batch.core.configuration.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.transaction.PlatformTransactionManager;

public class MissingTransactionManager implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.out.println("MissingTransactionManager.matches");
		return context.getBeanFactory().getBean(PlatformTransactionManager.class) != null;
	}
}
