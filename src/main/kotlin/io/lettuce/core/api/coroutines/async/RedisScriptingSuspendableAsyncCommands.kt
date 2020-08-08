/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package io.lettuce.core.api.coroutines.async

import kotlinx.coroutines.future.await
import io.lettuce.core.api.coroutines.*
import io.lettuce.core.sentinel.api.coroutines.*
import io.lettuce.core.api.async.*
import io.lettuce.core.sentinel.api.async.*
import io.lettuce.core.ExperimentalLettuceCoroutinesApi
import io.lettuce.core.ScriptOutputType


/**
 * Coroutine executed commands (based on async commands) for Scripting. {@link java.lang.String Lua scripts} are encoded by using the configured
 * {@link io.lettuce.core.ClientOptions#getScriptCharset() charset}.
 * 
 * @param <K> Key type.
 * @param <V> Value type.
 * @author Mikhael Sokolov
 * @since 6.0
 * 
 * @generated by io.lettuce.apigenerator.CreateKotlinCoroutinesAsyncImplementation
 **/
@ExperimentalLettuceCoroutinesApi
internal class RedisScriptingSuspendableAsyncCommands<K, V>(private val ops: RedisScriptingAsyncCommands<K, V>) : RedisScriptingSuspendableCommands<K, V> {

    /**
     * Execute a Lua script server side.
     * 
     * @param script Lua 5.1 script.
     * @param type output type.
     * @param keys key names.
     * @param <T> expected return type.
     * @return script result.
     * 
     **/
    override suspend fun <T> eval(script: String?, type: ScriptOutputType?, vararg keys: K?): T? = ops.eval<T>(script, type, *keys).await()

    /**
     * Execute a Lua script server side.
     * 
     * @param script Lua 5.1 script.
     * @param type output type.
     * @param keys key names.
     * @param <T> expected return type.
     * @return script result.
     * @since 6.0
     * 
     **/
    override suspend fun <T> eval(script: ByteArray?, type: ScriptOutputType?, vararg keys: K?): T? = ops.eval<T>(script, type, *keys).await()

    /**
     * Execute a Lua script server side.
     * 
     * @param script Lua 5.1 script.
     * @param type the type.
     * @param keys the keys.
     * @param values the values.
     * @param <T> expected return type.
     * @return script result.
     * 
     **/
    override suspend fun <T> eval(script: String?, type: ScriptOutputType?, keys: Array<K?>?, vararg values: V?): T? = ops.eval<T>(script, type, keys, *values).await()

    /**
     * Execute a Lua script server side.
     * 
     * @param script Lua 5.1 script.
     * @param type the type.
     * @param keys the keys.
     * @param values the values.
     * @param <T> expected return type.
     * @return script result.
     * @since 6.0
     * 
     **/
    override suspend fun <T> eval(script: ByteArray?, type: ScriptOutputType?, keys: Array<K?>?, vararg values: V?): T? = ops.eval<T>(script, type, keys, *values).await()

    /**
     * Evaluates a script cached on the server side by its SHA1 digest.
     * 
     * @param digest SHA1 of the script.
     * @param type the type.
     * @param keys the keys.
     * @param <T> expected return type.
     * @return script result.
     * 
     **/
    override suspend fun <T> evalsha(digest: String?, type: ScriptOutputType?, vararg keys: K?): T? = ops.evalsha<T>(digest, type, *keys).await()

    /**
     * Execute a Lua script server side.
     * 
     * @param digest SHA1 of the script.
     * @param type the type.
     * @param keys the keys.
     * @param values the values.
     * @param <T> expected return type.
     * @return script result.
     * 
     **/
    override suspend fun <T> evalsha(digest: String?, type: ScriptOutputType?, keys: Array<K?>?, vararg values: V?): T? = ops.evalsha<T>(digest, type, keys, *values).await()

    /**
     * Check existence of scripts in the script cache.
     * 
     * @param digests script digests.
     * @return List<Boolean> array-reply The command returns an array of integers that correspond to the specified SHA1
     *         digest arguments. For every corresponding SHA1 digest of a script that actually exists in the script cache, an 1
     *         is returned, otherwise 0 is returned.
     * 
     **/
    override suspend fun scriptExists(vararg digests: String?): List<Boolean>? = ops.scriptExists(*digests).await()

    /**
     * Remove all the scripts from the script cache.
     * 
     * @return String simple-string-reply.
     * 
     **/
    override suspend fun scriptFlush(): String? = ops.scriptFlush().await()

    /**
     * Kill the script currently in execution.
     * 
     * @return String simple-string-reply.
     * 
     **/
    override suspend fun scriptKill(): String? = ops.scriptKill().await()

    /**
     * Load the specified Lua script into the script cache.
     * 
     * @param script script content.
     * @return String bulk-string-reply This command returns the SHA1 digest of the script added into the script cache.
     * @since 6.0
     * 
     **/
    override suspend fun scriptLoad(script: String?): String? = ops.scriptLoad(script).await()

    /**
     * Load the specified Lua script into the script cache.
     * 
     * @param script script content.
     * @return String bulk-string-reply This command returns the SHA1 digest of the script added into the script cache.
     * @since 6.0
     * 
     **/
    override suspend fun scriptLoad(script: ByteArray?): String? = ops.scriptLoad(script).await()

    /**
     * Create a SHA1 digest from a Lua script.
     * 
     * @param script script content.
     * @return the SHA1 value.
     * @since 6.0
     * 
     **/
    override suspend fun digest(script: String?): String? = ops.digest(script)

    /**
     * Create a SHA1 digest from a Lua script.
     * 
     * @param script script content.
     * @return the SHA1 value.
     * @since 6.0
     * 
     **/
    override suspend fun digest(script: ByteArray?): String? = ops.digest(script)

}

