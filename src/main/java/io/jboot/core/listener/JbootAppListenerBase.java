/**
 * Copyright (c) 2015-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.core.listener;

import com.jfinal.config.Constants;
import com.jfinal.config.Interceptors;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;
import io.jboot.aop.jfinal.JfinalHandlers;
import io.jboot.aop.jfinal.JfinalPlugins;
import io.jboot.web.fixedinterceptor.FixedInterceptors;


public class JbootAppListenerBase implements JbootAppListener {


    @Override
    public void onInit() {

    }

    @Override
    public void onJfinalConstantConfig(Constants constants) {

    }

    @Override
    public void onJfinalRouteConfig(Routes routes) {

    }

    @Override
    public void onJfinalEngineConfig(Engine engine) {

    }

    @Override
    public void onJfinalPluginConfig(JfinalPlugins plugins) {

    }

    @Override
    public void onInterceptorConfig(Interceptors interceptors) {

    }

    @Override
    public void onFixedInterceptorConfig(FixedInterceptors fixedInterceptors) {

    }

    @Override
    public void onHandlerConfig(JfinalHandlers handlers) {

    }

    @Override
    public void onJFinalStartedBefore() {

    }

    @Override
    public void onJFinalStarted() {

    }

    @Override
    public void onJFinalStartedAfter() {

    }

    @Override
    public void onJFinalStop() {

    }

}
