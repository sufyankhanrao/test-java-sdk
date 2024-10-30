/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.Context;
import io.apimatic.coreinterfaces.http.HttpHeaders;
import io.apimatic.coreinterfaces.http.Method;
import io.apimatic.coreinterfaces.http.request.Request;
import io.apimatic.coreinterfaces.http.response.ApiResponseType;
import io.apimatic.coreinterfaces.http.response.DynamicType;
import io.apimatic.coreinterfaces.http.response.Response;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import localhost3000.http.Headers;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpBodyRequest;
import localhost3000.http.request.HttpMethod;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;

public class CompatibilityFactoryImpl implements CompatibilityFactory {

    @Override
    public Context createHttpContext(Request request, Response response) {
        return new HttpContext((HttpRequest) request, (HttpResponse) response);
    }

    @Override
    public Request createHttpRequest(Method httpMethod,
            StringBuilder queryUrlBuilder, HttpHeaders headers, Map<String, Object> queryParameters,
            List<SimpleEntry<String, Object>> formParameters) {
        return new HttpRequest(HttpMethod.valueOf(httpMethod.toString()), queryUrlBuilder,
                (Headers) headers, queryParameters, formParameters);
    }

    @Override
    public Request createHttpRequest(Method httpMethod,
            StringBuilder queryUrlBuilder, HttpHeaders headers, Map<String, Object> queryParameters,
            Object body) {
        return new HttpBodyRequest(HttpMethod.valueOf(httpMethod.toString()), queryUrlBuilder,
                (Headers) headers, queryParameters, body);
    }

    @Override
    public Response createHttpResponse(int code, HttpHeaders headers, InputStream rawBody) {
        return new HttpResponse(code, (Headers) headers, rawBody);
    }

    @Override
    public Response createHttpResponse(int code, HttpHeaders headers, InputStream rawBody,
            String body) {
        return new HttpStringResponse(code, (Headers) headers, rawBody, body);
    }

    @Override
    public HttpHeaders createHttpHeaders(Map<String, List<String>> headers) {
        return new Headers(headers);
    }

    @Override
    public HttpHeaders createHttpHeaders(HttpHeaders headers) {
        return new Headers((Headers) headers);
    }

    @Override
    public HttpHeaders createHttpHeaders() {
        return new Headers();
    }

    @Override
    public DynamicType createDynamicResponse(Response httpResponse) {
          return null;
    }

    @Override
    public <T> ApiResponseType<T> createApiResponse(int statusCode, HttpHeaders headers, T result) {
          return null;
    }

}