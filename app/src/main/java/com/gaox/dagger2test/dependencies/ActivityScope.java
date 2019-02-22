package com.gaox.dagger2test.dependencies;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author: gaox
 * @date: 2019/02/21 10:32
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}

