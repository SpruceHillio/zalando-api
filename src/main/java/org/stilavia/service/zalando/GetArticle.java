/*
 * Copyright 2015 Stilavia S.L.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.stilavia.service.zalando;

import org.codehaus.jackson.type.TypeReference;
import org.stilavia.service.zalando.model.Article;

/**
 * Created by guillermoblascojimenez on 15/06/15.
 */
class GetArticle extends ExecutableRequestChain<Article> {

    private static final String PATH = "/articles/%s";
    private static final TypeReference<Article> TYPE_REFERENCE = new TypeReference<Article>() {
    };

    private final String articleId;

    GetArticle(RequestContext context, String articleId) {
        super(context, getPath(articleId), TYPE_REFERENCE);
        this.articleId = articleId;
    }

    private static String getPath(String articleId) {
        return String.format(PATH, articleId);
    }

}