package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ApacheLibraryAccessors laccForApacheLibraryAccessors = new ApacheLibraryAccessors(owner);
    private final AxonframeworkLibraryAccessors laccForAxonframeworkLibraryAccessors = new AxonframeworkLibraryAccessors(owner);
    private final DashjoinLibraryAccessors laccForDashjoinLibraryAccessors = new DashjoinLibraryAccessors(owner);
    private final DatadogLibraryAccessors laccForDatadogLibraryAccessors = new DatadogLibraryAccessors(owner);
    private final EasyRulesLibraryAccessors laccForEasyRulesLibraryAccessors = new EasyRulesLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final KeycloakLibraryAccessors laccForKeycloakLibraryAccessors = new KeycloakLibraryAccessors(owner);
    private final MapstructLibraryAccessors laccForMapstructLibraryAccessors = new MapstructLibraryAccessors(owner);
    private final NetworkntLibraryAccessors laccForNetworkntLibraryAccessors = new NetworkntLibraryAccessors(owner);
    private final ObfuscationLibraryAccessors laccForObfuscationLibraryAccessors = new ObfuscationLibraryAccessors(owner);
    private final OpentelemetryLibraryAccessors laccForOpentelemetryLibraryAccessors = new OpentelemetryLibraryAccessors(owner);
    private final ProjectnessieLibraryAccessors laccForProjectnessieLibraryAccessors = new ProjectnessieLibraryAccessors(owner);
    private final QuerydslLibraryAccessors laccForQuerydslLibraryAccessors = new QuerydslLibraryAccessors(owner);
    private final SpringLibraryAccessors laccForSpringLibraryAccessors = new SpringLibraryAccessors(owner);
    private final SpringbootLibraryAccessors laccForSpringbootLibraryAccessors = new SpringbootLibraryAccessors(owner);
    private final SpringcloudLibraryAccessors laccForSpringcloudLibraryAccessors = new SpringcloudLibraryAccessors(owner);
    private final SpringcloudgcpLibraryAccessors laccForSpringcloudgcpLibraryAccessors = new SpringcloudgcpLibraryAccessors(owner);
    private final SpringdocLibraryAccessors laccForSpringdocLibraryAccessors = new SpringdocLibraryAccessors(owner);
    private final SwaggerLibraryAccessors laccForSwaggerLibraryAccessors = new SwaggerLibraryAccessors(owner);
    private final VictoolsLibraryAccessors laccForVictoolsLibraryAccessors = new VictoolsLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>awaitility</b> with <b>org.awaitility:awaitility</b> coordinates and
     * with version reference <b>awaitility</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAwaitility() {
        return create("awaitility");
    }

    /**
     * Dependency provider for <b>easyRandom</b> with <b>org.jeasy:easy-random-core</b> coordinates and
     * with version reference <b>easyRandom</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getEasyRandom() {
        return create("easyRandom");
    }

    /**
     * Dependency provider for <b>instancio</b> with <b>org.instancio:instancio-junit</b> coordinates and
     * with version reference <b>instancio</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getInstancio() {
        return create("instancio");
    }

    /**
     * Dependency provider for <b>jgrapht</b> with <b>org.jgrapht:jgrapht-core</b> coordinates and
     * with version reference <b>jgrapht</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getJgrapht() {
        return create("jgrapht");
    }

    /**
     * Dependency provider for <b>jobrunr</b> with <b>org.jobrunr:jobrunr-spring-boot-3-starter</b> coordinates and
     * with version reference <b>jobrunr</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getJobrunr() {
        return create("jobrunr");
    }

    /**
     * Dependency provider for <b>jsonPath</b> with <b>com.jayway.jsonpath:json-path</b> coordinates and
     * with version reference <b>json.path</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getJsonPath() {
        return create("jsonPath");
    }

    /**
     * Dependency provider for <b>lombok</b> with <b>org.projectlombok:lombok</b> coordinates and
     * with version reference <b>lombok</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getLombok() {
        return create("lombok");
    }

    /**
     * Dependency provider for <b>modelMapper</b> with <b>org.modelmapper:modelmapper</b> coordinates and
     * with version reference <b>modelMapper</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getModelMapper() {
        return create("modelMapper");
    }

    /**
     * Dependency provider for <b>mustache</b> with <b>com.github.spullara.mustache.java:compiler</b> coordinates and
     * with version reference <b>mustache</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMustache() {
        return create("mustache");
    }

    /**
     * Dependency provider for <b>opencsv</b> with <b>com.opencsv:opencsv</b> coordinates and
     * with version reference <b>opencsv</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getOpencsv() {
        return create("opencsv");
    }

    /**
     * Dependency provider for <b>thymeleaf</b> with <b>org.thymeleaf:thymeleaf</b> coordinates and
     * with version reference <b>thymeleaf</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getThymeleaf() {
        return create("thymeleaf");
    }

    /**
     * Dependency provider for <b>wiremock</b> with <b>org.wiremock:wiremock-standalone</b> coordinates and
     * with version reference <b>wiremock</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getWiremock() {
        return create("wiremock");
    }

    /**
     * Group of libraries at <b>apache</b>
     */
    public ApacheLibraryAccessors getApache() {
        return laccForApacheLibraryAccessors;
    }

    /**
     * Group of libraries at <b>axonframework</b>
     */
    public AxonframeworkLibraryAccessors getAxonframework() {
        return laccForAxonframeworkLibraryAccessors;
    }

    /**
     * Group of libraries at <b>dashjoin</b>
     */
    public DashjoinLibraryAccessors getDashjoin() {
        return laccForDashjoinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>datadog</b>
     */
    public DatadogLibraryAccessors getDatadog() {
        return laccForDatadogLibraryAccessors;
    }

    /**
     * Group of libraries at <b>easyRules</b>
     */
    public EasyRulesLibraryAccessors getEasyRules() {
        return laccForEasyRulesLibraryAccessors;
    }

    /**
     * Group of libraries at <b>google</b>
     */
    public GoogleLibraryAccessors getGoogle() {
        return laccForGoogleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>io</b>
     */
    public IoLibraryAccessors getIo() {
        return laccForIoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jakarta</b>
     */
    public JakartaLibraryAccessors getJakarta() {
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>keycloak</b>
     */
    public KeycloakLibraryAccessors getKeycloak() {
        return laccForKeycloakLibraryAccessors;
    }

    /**
     * Group of libraries at <b>mapstruct</b>
     */
    public MapstructLibraryAccessors getMapstruct() {
        return laccForMapstructLibraryAccessors;
    }

    /**
     * Group of libraries at <b>networknt</b>
     */
    public NetworkntLibraryAccessors getNetworknt() {
        return laccForNetworkntLibraryAccessors;
    }

    /**
     * Group of libraries at <b>obfuscation</b>
     */
    public ObfuscationLibraryAccessors getObfuscation() {
        return laccForObfuscationLibraryAccessors;
    }

    /**
     * Group of libraries at <b>opentelemetry</b>
     */
    public OpentelemetryLibraryAccessors getOpentelemetry() {
        return laccForOpentelemetryLibraryAccessors;
    }

    /**
     * Group of libraries at <b>projectnessie</b>
     */
    public ProjectnessieLibraryAccessors getProjectnessie() {
        return laccForProjectnessieLibraryAccessors;
    }

    /**
     * Group of libraries at <b>querydsl</b>
     */
    public QuerydslLibraryAccessors getQuerydsl() {
        return laccForQuerydslLibraryAccessors;
    }

    /**
     * Group of libraries at <b>spring</b>
     */
    public SpringLibraryAccessors getSpring() {
        return laccForSpringLibraryAccessors;
    }

    /**
     * Group of libraries at <b>springboot</b>
     */
    public SpringbootLibraryAccessors getSpringboot() {
        return laccForSpringbootLibraryAccessors;
    }

    /**
     * Group of libraries at <b>springcloud</b>
     */
    public SpringcloudLibraryAccessors getSpringcloud() {
        return laccForSpringcloudLibraryAccessors;
    }

    /**
     * Group of libraries at <b>springcloudgcp</b>
     */
    public SpringcloudgcpLibraryAccessors getSpringcloudgcp() {
        return laccForSpringcloudgcpLibraryAccessors;
    }

    /**
     * Group of libraries at <b>springdoc</b>
     */
    public SpringdocLibraryAccessors getSpringdoc() {
        return laccForSpringdocLibraryAccessors;
    }

    /**
     * Group of libraries at <b>swagger</b>
     */
    public SwaggerLibraryAccessors getSwagger() {
        return laccForSwaggerLibraryAccessors;
    }

    /**
     * Group of libraries at <b>victools</b>
     */
    public VictoolsLibraryAccessors getVictools() {
        return laccForVictoolsLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class ApacheLibraryAccessors extends SubDependencyFactory {
        private final ApacheCommonsLibraryAccessors laccForApacheCommonsLibraryAccessors = new ApacheCommonsLibraryAccessors(owner);

        public ApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>apache.commons</b>
         */
        public ApacheCommonsLibraryAccessors getCommons() {
            return laccForApacheCommonsLibraryAccessors;
        }

    }

    public static class ApacheCommonsLibraryAccessors extends SubDependencyFactory {

        public ApacheCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>text</b> with <b>org.apache.commons:commons-text</b> coordinates and
         * with version reference <b>apacheCommonsText</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getText() {
            return create("apache.commons.text");
        }

    }

    public static class AxonframeworkLibraryAccessors extends SubDependencyFactory {

        public AxonframeworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.axonframework:axon-bom</b> coordinates and
         * with version reference <b>axonframework</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("axonframework.bom");
        }

    }

    public static class DashjoinLibraryAccessors extends SubDependencyFactory {

        public DashjoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jsonata</b> with <b>com.dashjoin:jsonata</b> coordinates and
         * with version reference <b>dashjoin.jsonata</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonata() {
            return create("dashjoin.jsonata");
        }

    }

    public static class DatadogLibraryAccessors extends SubDependencyFactory {

        public DatadogLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>agent</b> with <b>com.datadoghq:dd-java-agent</b> coordinates and
         * with version reference <b>datadog</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAgent() {
            return create("datadog.agent");
        }

    }

    public static class EasyRulesLibraryAccessors extends SubDependencyFactory {

        public EasyRulesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.jeasy:easy-rules-core</b> coordinates and
         * with version reference <b>easyRules</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("easyRules.core");
        }

        /**
         * Dependency provider for <b>spel</b> with <b>org.jeasy:easy-rules-spel</b> coordinates and
         * with version reference <b>easyRules</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpel() {
            return create("easyRules.spel");
        }

        /**
         * Dependency provider for <b>support</b> with <b>org.jeasy:easy-rules-support</b> coordinates and
         * with version reference <b>easyRules</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSupport() {
            return create("easyRules.support");
        }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>beanMatchers</b> with <b>com.google.code.bean-matchers:bean-matchers</b> coordinates and
         * with version <b>0.14</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBeanMatchers() {
            return create("google.beanMatchers");
        }

        /**
         * Dependency provider for <b>cel</b> with <b>dev.cel:cel</b> coordinates and
         * with version reference <b>google.cel</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCel() {
            return create("google.cel");
        }

        /**
         * Dependency provider for <b>guava</b> with <b>com.google.guava:guava</b> coordinates and
         * with version reference <b>google.guava</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGuava() {
            return create("google.guava");
        }

    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoNettyLibraryAccessors laccForIoNettyLibraryAccessors = new IoNettyLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.netty</b>
         */
        public IoNettyLibraryAccessors getNetty() {
            return laccForIoNettyLibraryAccessors;
        }

    }

    public static class IoNettyLibraryAccessors extends SubDependencyFactory {

        public IoNettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>macos</b> with <b>io.netty:netty-resolver-dns-native-macos</b> coordinates and
         * with version reference <b>ioNettyMacOS</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMacos() {
            return create("io.netty.macos");
        }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>mail</b> with <b>com.sun.mail:jakarta.mail</b> coordinates and
         * with version reference <b>jakarta.mail</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMail() {
            return create("jakarta.mail");
        }

    }

    public static class KeycloakLibraryAccessors extends SubDependencyFactory {
        private final KeycloakAdminLibraryAccessors laccForKeycloakAdminLibraryAccessors = new KeycloakAdminLibraryAccessors(owner);

        public KeycloakLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>keycloak.admin</b>
         */
        public KeycloakAdminLibraryAccessors getAdmin() {
            return laccForKeycloakAdminLibraryAccessors;
        }

    }

    public static class KeycloakAdminLibraryAccessors extends SubDependencyFactory {

        public KeycloakAdminLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>org.keycloak:keycloak-admin-client</b> coordinates and
         * with version reference <b>keycloak</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClient() {
            return create("keycloak.admin.client");
        }

    }

    public static class MapstructLibraryAccessors extends SubDependencyFactory {
        private final MapstructLombokLibraryAccessors laccForMapstructLombokLibraryAccessors = new MapstructLombokLibraryAccessors(owner);

        public MapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.mapstruct:mapstruct</b> coordinates and
         * with version reference <b>mapstruct</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("mapstruct.core");
        }

        /**
         * Dependency provider for <b>processor</b> with <b>org.mapstruct:mapstruct-processor</b> coordinates and
         * with version reference <b>mapstruct</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getProcessor() {
            return create("mapstruct.processor");
        }

        /**
         * Group of libraries at <b>mapstruct.lombok</b>
         */
        public MapstructLombokLibraryAccessors getLombok() {
            return laccForMapstructLombokLibraryAccessors;
        }

    }

    public static class MapstructLombokLibraryAccessors extends SubDependencyFactory {

        public MapstructLombokLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>binding</b> with <b>org.projectlombok:lombok-mapstruct-binding</b> coordinates and
         * with version <b>0.2.0</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBinding() {
            return create("mapstruct.lombok.binding");
        }

    }

    public static class NetworkntLibraryAccessors extends SubDependencyFactory {
        private final NetworkntJsonschemaLibraryAccessors laccForNetworkntJsonschemaLibraryAccessors = new NetworkntJsonschemaLibraryAccessors(owner);

        public NetworkntLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>networknt.jsonschema</b>
         */
        public NetworkntJsonschemaLibraryAccessors getJsonschema() {
            return laccForNetworkntJsonschemaLibraryAccessors;
        }

    }

    public static class NetworkntJsonschemaLibraryAccessors extends SubDependencyFactory {

        public NetworkntJsonschemaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>validator</b> with <b>com.networknt:json-schema-validator</b> coordinates and
         * with version reference <b>jsonschemaValidator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getValidator() {
            return create("networknt.jsonschema.validator");
        }

    }

    public static class ObfuscationLibraryAccessors extends SubDependencyFactory {

        public ObfuscationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>com.github.robtimus:obfuscation-core</b> coordinates and
         * with version <b>1.5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("obfuscation.core");
        }

    }

    public static class OpentelemetryLibraryAccessors extends SubDependencyFactory {

        public OpentelemetryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>io.opentelemetry.instrumentation:opentelemetry-instrumentation-bom</b> coordinates and
         * with version reference <b>opentelemetry</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("opentelemetry.bom");
        }

    }

    public static class ProjectnessieLibraryAccessors extends SubDependencyFactory {
        private final ProjectnessieCelLibraryAccessors laccForProjectnessieCelLibraryAccessors = new ProjectnessieCelLibraryAccessors(owner);

        public ProjectnessieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>projectnessie.cel</b>
         */
        public ProjectnessieCelLibraryAccessors getCel() {
            return laccForProjectnessieCelLibraryAccessors;
        }

    }

    public static class ProjectnessieCelLibraryAccessors extends SubDependencyFactory {

        public ProjectnessieCelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.projectnessie.cel:cel-bom</b> coordinates and
         * with version reference <b>projectnessie.cel</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("projectnessie.cel.bom");
        }

    }

    public static class QuerydslLibraryAccessors extends SubDependencyFactory {

        public QuerydslLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>apt</b> with <b>com.querydsl:querydsl-apt</b> coordinates and
         * with version reference <b>querydsl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApt() {
            return create("querydsl.apt");
        }

        /**
         * Dependency provider for <b>mongodb</b> with <b>com.querydsl:querydsl-mongodb</b> coordinates and
         * with version reference <b>querydsl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMongodb() {
            return create("querydsl.mongodb");
        }

    }

    public static class SpringLibraryAccessors extends SubDependencyFactory {

        public SpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>retry</b> with <b>org.springframework.retry:spring-retry</b> coordinates and
         * with version reference <b>spring.retry</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRetry() {
            return create("spring.retry");
        }

    }

    public static class SpringbootLibraryAccessors extends SubDependencyFactory {

        public SpringbootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.springframework.boot:spring-boot-dependencies</b> coordinates and
         * with version reference <b>springboot</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("springboot.bom");
        }

    }

    public static class SpringcloudLibraryAccessors extends SubDependencyFactory {

        public SpringcloudLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.springframework.cloud:spring-cloud-dependencies</b> coordinates and
         * with version reference <b>springcloud</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("springcloud.bom");
        }

    }

    public static class SpringcloudgcpLibraryAccessors extends SubDependencyFactory {

        public SpringcloudgcpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>com.google.cloud:spring-cloud-gcp-dependencies</b> coordinates and
         * with version reference <b>springcloudgcp</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("springcloudgcp.bom");
        }

    }

    public static class SpringdocLibraryAccessors extends SubDependencyFactory {
        private final SpringdocOpenapiLibraryAccessors laccForSpringdocOpenapiLibraryAccessors = new SpringdocOpenapiLibraryAccessors(owner);

        public SpringdocLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>springdoc.openapi</b>
         */
        public SpringdocOpenapiLibraryAccessors getOpenapi() {
            return laccForSpringdocOpenapiLibraryAccessors;
        }

    }

    public static class SpringdocOpenapiLibraryAccessors extends SubDependencyFactory {
        private final SpringdocOpenapiWebfluxLibraryAccessors laccForSpringdocOpenapiWebfluxLibraryAccessors = new SpringdocOpenapiWebfluxLibraryAccessors(owner);
        private final SpringdocOpenapiWebmvcLibraryAccessors laccForSpringdocOpenapiWebmvcLibraryAccessors = new SpringdocOpenapiWebmvcLibraryAccessors(owner);

        public SpringdocOpenapiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>org.springdoc:springdoc-openapi-starter-common</b> coordinates and
         * with version reference <b>springdoc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("springdoc.openapi.common");
        }

        /**
         * Group of libraries at <b>springdoc.openapi.webflux</b>
         */
        public SpringdocOpenapiWebfluxLibraryAccessors getWebflux() {
            return laccForSpringdocOpenapiWebfluxLibraryAccessors;
        }

        /**
         * Group of libraries at <b>springdoc.openapi.webmvc</b>
         */
        public SpringdocOpenapiWebmvcLibraryAccessors getWebmvc() {
            return laccForSpringdocOpenapiWebmvcLibraryAccessors;
        }

    }

    public static class SpringdocOpenapiWebfluxLibraryAccessors extends SubDependencyFactory {

        public SpringdocOpenapiWebfluxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webflux-ui</b> coordinates and
         * with version reference <b>springdoc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUi() {
            return create("springdoc.openapi.webflux.ui");
        }

    }

    public static class SpringdocOpenapiWebmvcLibraryAccessors extends SubDependencyFactory {

        public SpringdocOpenapiWebmvcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.springdoc:springdoc-openapi-starter-webmvc-api</b> coordinates and
         * with version reference <b>springdoc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("springdoc.openapi.webmvc.api");
        }

        /**
         * Dependency provider for <b>ui</b> with <b>org.springdoc:springdoc-openapi-starter-webmvc-ui</b> coordinates and
         * with version reference <b>springdoc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUi() {
            return create("springdoc.openapi.webmvc.ui");
        }

    }

    public static class SwaggerLibraryAccessors extends SubDependencyFactory {

        public SwaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>parser</b> with <b>io.swagger.parser.v3:swagger-parser-v3</b> coordinates and
         * with version reference <b>swagger.parser</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getParser() {
            return create("swagger.parser");
        }

    }

    public static class VictoolsLibraryAccessors extends SubDependencyFactory {
        private final VictoolsJsonschemaLibraryAccessors laccForVictoolsJsonschemaLibraryAccessors = new VictoolsJsonschemaLibraryAccessors(owner);

        public VictoolsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>victools.jsonschema</b>
         */
        public VictoolsJsonschemaLibraryAccessors getJsonschema() {
            return laccForVictoolsJsonschemaLibraryAccessors;
        }

    }

    public static class VictoolsJsonschemaLibraryAccessors extends SubDependencyFactory {
        private final VictoolsJsonschemaGeneratorLibraryAccessors laccForVictoolsJsonschemaGeneratorLibraryAccessors = new VictoolsJsonschemaGeneratorLibraryAccessors(owner);

        public VictoolsJsonschemaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>victools.jsonschema.generator</b>
         */
        public VictoolsJsonschemaGeneratorLibraryAccessors getGenerator() {
            return laccForVictoolsJsonschemaGeneratorLibraryAccessors;
        }

    }

    public static class VictoolsJsonschemaGeneratorLibraryAccessors extends SubDependencyFactory {
        private final VictoolsJsonschemaGeneratorModuleLibraryAccessors laccForVictoolsJsonschemaGeneratorModuleLibraryAccessors = new VictoolsJsonschemaGeneratorModuleLibraryAccessors(owner);

        public VictoolsJsonschemaGeneratorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>com.github.victools:jsonschema-generator</b> coordinates and
         * with version reference <b>jsonschemaGenerator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("victools.jsonschema.generator.core");
        }

        /**
         * Group of libraries at <b>victools.jsonschema.generator.module</b>
         */
        public VictoolsJsonschemaGeneratorModuleLibraryAccessors getModule() {
            return laccForVictoolsJsonschemaGeneratorModuleLibraryAccessors;
        }

    }

    public static class VictoolsJsonschemaGeneratorModuleLibraryAccessors extends SubDependencyFactory {

        public VictoolsJsonschemaGeneratorModuleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jackson</b> with <b>com.github.victools:jsonschema-module-jackson</b> coordinates and
         * with version reference <b>jsonschemaGenerator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJackson() {
            return create("victools.jsonschema.generator.module.jackson");
        }

        /**
         * Dependency provider for <b>jakarta</b> with <b>com.github.victools:jsonschema-module-jakarta-validation</b> coordinates and
         * with version reference <b>jsonschemaGenerator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJakarta() {
            return create("victools.jsonschema.generator.module.jakarta");
        }

        /**
         * Dependency provider for <b>swagger2</b> with <b>com.github.victools:jsonschema-module-swagger-2</b> coordinates and
         * with version reference <b>jsonschemaGenerator</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSwagger2() {
            return create("victools.jsonschema.generator.module.swagger2");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final DashjoinVersionAccessors vaccForDashjoinVersionAccessors = new DashjoinVersionAccessors(providers, config);
        private final GoogleVersionAccessors vaccForGoogleVersionAccessors = new GoogleVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final JsonVersionAccessors vaccForJsonVersionAccessors = new JsonVersionAccessors(providers, config);
        private final ProjectnessieVersionAccessors vaccForProjectnessieVersionAccessors = new ProjectnessieVersionAccessors(providers, config);
        private final SpringVersionAccessors vaccForSpringVersionAccessors = new SpringVersionAccessors(providers, config);
        private final SwaggerVersionAccessors vaccForSwaggerVersionAccessors = new SwaggerVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>apacheCommonsText</b> with value <b>1.11.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApacheCommonsText() { return getVersion("apacheCommonsText"); }

        /**
         * Version alias <b>awaitility</b> with value <b>4.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAwaitility() { return getVersion("awaitility"); }

        /**
         * Version alias <b>axonframework</b> with value <b>4.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAxonframework() { return getVersion("axonframework"); }

        /**
         * Version alias <b>datadog</b> with value <b>1.38.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getDatadog() { return getVersion("datadog"); }

        /**
         * Version alias <b>easyRandom</b> with value <b>5.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEasyRandom() { return getVersion("easyRandom"); }

        /**
         * Version alias <b>easyRules</b> with value <b>4.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEasyRules() { return getVersion("easyRules"); }

        /**
         * Version alias <b>instancio</b> with value <b>5.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getInstancio() { return getVersion("instancio"); }

        /**
         * Version alias <b>ioNettyMacOS</b> with value <b>4.1.110.Final</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getIoNettyMacOS() { return getVersion("ioNettyMacOS"); }

        /**
         * Version alias <b>jgrapht</b> with value <b>1.5.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJgrapht() { return getVersion("jgrapht"); }

        /**
         * Version alias <b>jobrunr</b> with value <b>7.2.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJobrunr() { return getVersion("jobrunr"); }

        /**
         * Version alias <b>jsonschemaGenerator</b> with value <b>4.36.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJsonschemaGenerator() { return getVersion("jsonschemaGenerator"); }

        /**
         * Version alias <b>jsonschemaValidator</b> with value <b>1.5.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJsonschemaValidator() { return getVersion("jsonschemaValidator"); }

        /**
         * Version alias <b>keycloak</b> with value <b>25.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKeycloak() { return getVersion("keycloak"); }

        /**
         * Version alias <b>lombok</b> with value <b>1.18.32</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLombok() { return getVersion("lombok"); }

        /**
         * Version alias <b>mapstruct</b> with value <b>1.6.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMapstruct() { return getVersion("mapstruct"); }

        /**
         * Version alias <b>modelMapper</b> with value <b>3.1.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getModelMapper() { return getVersion("modelMapper"); }

        /**
         * Version alias <b>mustache</b> with value <b>0.9.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMustache() { return getVersion("mustache"); }

        /**
         * Version alias <b>opencsv</b> with value <b>5.9</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getOpencsv() { return getVersion("opencsv"); }

        /**
         * Version alias <b>opentelemetry</b> with value <b>2.6.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getOpentelemetry() { return getVersion("opentelemetry"); }

        /**
         * Version alias <b>querydsl</b> with value <b>5.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getQuerydsl() { return getVersion("querydsl"); }

        /**
         * Version alias <b>springDependencyManagement</b> with value <b>1.1.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSpringDependencyManagement() { return getVersion("springDependencyManagement"); }

        /**
         * Version alias <b>springboot</b> with value <b>3.3.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSpringboot() { return getVersion("springboot"); }

        /**
         * Version alias <b>springcloud</b> with value <b>2023.0.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSpringcloud() { return getVersion("springcloud"); }

        /**
         * Version alias <b>springcloudgcp</b> with value <b>5.5.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSpringcloudgcp() { return getVersion("springcloudgcp"); }

        /**
         * Version alias <b>springdoc</b> with value <b>2.6.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSpringdoc() { return getVersion("springdoc"); }

        /**
         * Version alias <b>thymeleaf</b> with value <b>3.1.2.RELEASE</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getThymeleaf() { return getVersion("thymeleaf"); }

        /**
         * Version alias <b>wiremock</b> with value <b>3.6.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getWiremock() { return getVersion("wiremock"); }

        /**
         * Group of versions at <b>versions.dashjoin</b>
         */
        public DashjoinVersionAccessors getDashjoin() {
            return vaccForDashjoinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.google</b>
         */
        public GoogleVersionAccessors getGoogle() {
            return vaccForGoogleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jakarta</b>
         */
        public JakartaVersionAccessors getJakarta() {
            return vaccForJakartaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.json</b>
         */
        public JsonVersionAccessors getJson() {
            return vaccForJsonVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.projectnessie</b>
         */
        public ProjectnessieVersionAccessors getProjectnessie() {
            return vaccForProjectnessieVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.spring</b>
         */
        public SpringVersionAccessors getSpring() {
            return vaccForSpringVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.swagger</b>
         */
        public SwaggerVersionAccessors getSwagger() {
            return vaccForSwaggerVersionAccessors;
        }

    }

    public static class DashjoinVersionAccessors extends VersionFactory  {

        public DashjoinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>dashjoin.jsonata</b> with value <b>0.9.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJsonata() { return getVersion("dashjoin.jsonata"); }

    }

    public static class GoogleVersionAccessors extends VersionFactory  {

        public GoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>google.cel</b> with value <b>0.6.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCel() { return getVersion("google.cel"); }

        /**
         * Version alias <b>google.guava</b> with value <b>33.1.0-jre</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGuava() { return getVersion("google.guava"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jakarta.mail</b> with value <b>2.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMail() { return getVersion("jakarta.mail"); }

    }

    public static class JsonVersionAccessors extends VersionFactory  {

        public JsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>json.path</b> with value <b>2.9.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPath() { return getVersion("json.path"); }

    }

    public static class ProjectnessieVersionAccessors extends VersionFactory  {

        public ProjectnessieVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>projectnessie.cel</b> with value <b>0.5.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCel() { return getVersion("projectnessie.cel"); }

    }

    public static class SpringVersionAccessors extends VersionFactory  {

        public SpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.retry</b> with value <b>2.0.6</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRetry() { return getVersion("spring.retry"); }

    }

    public static class SwaggerVersionAccessors extends VersionFactory  {

        public SwaggerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>swagger.parser</b> with value <b>2.1.22</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getParser() { return getVersion("swagger.parser"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final GitPluginAccessors paccForGitPluginAccessors = new GitPluginAccessors(providers, config);
        private final JibPluginAccessors paccForJibPluginAccessors = new JibPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>sonarqube</b> with plugin id <b>org.sonarqube</b> and
         * with version <b>4.4.1.3373</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getSonarqube() { return createPlugin("sonarqube"); }

        /**
         * Plugin provider for <b>springDependencyManagement</b> with plugin id <b>io.spring.dependency-management</b> and
         * with version reference <b>springDependencyManagement</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getSpringDependencyManagement() { return createPlugin("springDependencyManagement"); }

        /**
         * Plugin provider for <b>springboot</b> with plugin id <b>org.springframework.boot</b> and
         * with version reference <b>springboot</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getSpringboot() { return createPlugin("springboot"); }

        /**
         * Group of plugins at <b>plugins.git</b>
         */
        public GitPluginAccessors getGit() {
            return paccForGitPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.jib</b>
         */
        public JibPluginAccessors getJib() {
            return paccForJibPluginAccessors;
        }

    }

    public static class GitPluginAccessors extends PluginFactory {

        public GitPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>git.info</b> with plugin id <b>com.gorylenko.gradle-git-properties</b> and
         * with version <b>2.4.2</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getInfo() { return createPlugin("git.info"); }

    }

    public static class JibPluginAccessors extends PluginFactory  implements PluginNotationSupplier{

        public JibPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>jib</b> with plugin id <b>com.google.cloud.tools.jib</b> and
         * with version <b>3.4.3</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> asProvider() { return createPlugin("jib"); }

        /**
         * Plugin provider for <b>jib.javaagent</b> with plugin id <b>com.ryandens.javaagent-jib</b> and
         * with version <b>0.5.2</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getJavaagent() { return createPlugin("jib.javaagent"); }

    }

}
