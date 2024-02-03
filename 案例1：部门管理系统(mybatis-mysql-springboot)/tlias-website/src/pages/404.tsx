import * as React from 'react';
import type {CSSProperties} from "react";
import img from "@/assets/404.png"

const NotFound: React.FC = () => {
    const wrapper: CSSProperties = {
        position: 'relative'
    }
    const notFind: CSSProperties = {
        margin: '150px auto 0 auto',
        display: 'block'
    }
    const desc: CSSProperties = {
        position: 'absolute',
        top: '36%',
        left: '44%',
        color: '#999999',
        fontSize: '18px',
    }
    const toIndex: CSSProperties = {
        position: 'absolute',
        top: '43%',
        left: '48%',
        border: '2px solid #94bff3',
        color: '#94bff3',
        borderRadius: '15px',
        padding: '2px 14px',
        fontSize: '15px',
    }
    return (
        <div className="container">
            <div style={wrapper}>
                <img style={notFind} src={img} alt="404图片"/>
                <span style={desc}>很抱歉，您访问的页面不存在~~</span>
                <a style={toIndex} href="/">返回首页</a>
            </div>
        </div>
    );
}

export default NotFound;