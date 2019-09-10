package com.github.study.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author bozhu
 * @description
 * @data 2019/9/7
 */
public class DemoServerHandler extends SimpleChannelInboundHandler {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        System.out.println("Client say : " + o.toString());
        //返回客户端消息 - 我已经接收到了你的消息
        channelHandlerContext.writeAndFlush("Received your message : " + o.toString());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("RemoteAddress : " + ctx.channel().remoteAddress() + "in active !");
        ctx.writeAndFlush("链接成功");
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("RemoteAddress : " + ctx.channel().remoteAddress() + " active !");
        super.channelInactive(ctx);
    }
}
