package com.gaox.dagger2test.simple;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author: gaox
 * @date: 2019/02/21 10:32
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface SugarWithNone {
}
