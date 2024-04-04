package org.junit.runners;

import org.junit.Rule;

 public class RuleEntry {
    static final int TYPE_TEST_RULE = 1;
    static final int TYPE_METHOD_RULE = 0;

    final Object rule;
    final int type;
    final int order;

     RuleEntry(Object rule, int type, Integer order) {
        this.rule = rule;
        this.type = type;
        this.order = order != null ? order : Rule.DEFAULT_ORDER;
    }
}