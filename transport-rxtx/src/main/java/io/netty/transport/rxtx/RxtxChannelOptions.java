/*
 * Copyright 2013 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.transport.rxtx;

import io.netty.channel.ChannelOption;
import io.netty.transport.rxtx.RxtxChannelConfig.Databits;
import io.netty.transport.rxtx.RxtxChannelConfig.Paritybit;
import io.netty.transport.rxtx.RxtxChannelConfig.Stopbits;

/**
 * Options for configuring a serial port connection
 */
public final class RxtxChannelOptions {
    public static final ChannelOption<Integer> BAUD_RATE =
            new ChannelOption<Integer>("BAUD_RATE");

    public static final ChannelOption<Boolean> DTR =
            new ChannelOption<Boolean>("DTR");

    public static final ChannelOption<Boolean> RTS =
            new ChannelOption<Boolean>("RTS");

    public static final ChannelOption<Stopbits> STOP_BITS =
            new ChannelOption<Stopbits>("STOP_BITS");

    public static final ChannelOption<Databits> DATA_BITS =
            new ChannelOption<Databits>("DATA_BITS");

    public static final ChannelOption<Paritybit> PARITY_BIT =
            new ChannelOption<Paritybit>("PARITY_BIT");

    private RxtxChannelOptions() {
    }
}
