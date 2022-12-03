package com.acme;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.function.Consumer;

@RecordBuilder
public record Record2(String property21, String property22, Consumer<Record1Builder> mybuilder) {}
