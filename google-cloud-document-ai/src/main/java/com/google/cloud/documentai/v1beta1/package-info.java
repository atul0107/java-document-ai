/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud Document AI API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================================== DocumentUnderstandingServiceClient
 * ==================================
 *
 * <p>Service Description: Service to parse structured information from unstructured or
 * semi-structured documents using state-of-the-art Google AI such as natural language, computer
 * vision, and translation.
 *
 * <p>Sample for DocumentUnderstandingServiceClient:
 *
 * <pre>
 * <code>
 * try (DocumentUnderstandingServiceClient documentUnderstandingServiceClient = DocumentUnderstandingServiceClient.create()) {
 *   List&lt;ProcessDocumentRequest&gt; requests = new ArrayList&lt;&gt;();
 *   BatchProcessDocumentsResponse response = documentUnderstandingServiceClient.batchProcessDocumentsAsync(requests);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.documentai.v1beta1;

import javax.annotation.Generated;
