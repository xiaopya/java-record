export default [
    {
        path: '/',
        redirect: '/home',
    },
    // {
    //     path: '/login',
    //     component: '@/pages/Login',
    //     layout: false,
    // },
    {
        name: '首页',
        icon: 'SignalFilled',
        path: '/home',
        component: '@/pages/Home',
    },
    {
        name: '部门管理',
        icon: 'SettingFilled',
        path: '/dms',
        routes: [
            {
                name: '部门',
                path: '/dms/dept',
                component: '@/pages/Dms/Dept',
            },
            {
                name: '用户',
                path: '/dms/emp',
                component: '@/pages/Dms/Emp',
            },
        ]
    },
    {path: '/*', component: '@/pages/404', layout: false},
]