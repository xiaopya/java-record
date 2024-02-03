import { defineConfig } from '@umijs/max';
import routes from "./routes";
export default defineConfig({
    antd: {},
    access: {},
    model: {},
    initialState: {},
    request: {},
    layout: {
        title: 'xiaopy',
    },
    proxy: {
        '/api': {
            'target': 'http://localhost:8080',
            'changeOrigin': true,
            'pathRewrite': { '^/api' : '' },
        }
    },
    routes,
    npmClient: 'pnpm',
});

