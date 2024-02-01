import { Link, Outlet,useAppData } from "umi";
import { Breadcrumb, Layout, Menu, theme } from "antd";
import styles from "./layout.less";

const { Header, Content, Sider } = Layout;


  function handlerRoutes(routes) {
    const temp = [];
    routes.forEach((route,index) => {
        if (!route?.redirect) {
            temp.push({
                key: route.id,
                label: <Link to={route.path}>{route.title}</Link>,
            });
        }
        if (route.routes) {
          route.routes.forEach(extract);
        }
      });
  
    return temp;
  }
  

export default () => {
  const {
    token: { colorBgContainer, borderRadiusLG },
  } = theme.useToken();
  
  const {routes} = useAppData();
  
  
  // 获取路由信息
  return (
    <Layout style={{ height: "100vh", width: "100wh" }}>
      <Header
        style={{
          display: "flex",
          height: "49px",
          borderBottom: "1px solid #EAEBEF",
          backgroundColor: "#F1F2F6",
          alignItems: "center",
          padding: 0,
        }}
      >
        <div className={styles.logo}>
          图标：{"{"}xiaopy{"}"}
        </div>
        {/* <div className="demo-logo" />
        <Menu
          theme="light"
          mode="horizontal"
          defaultSelectedKeys={["2"]}
          items={items1}
          style={{ flex: 1, minWidth: 0, backgroundColor: "#F1F2F6" }}
        /> */}
      </Header>
      <Layout>
        <Sider width={200}>
          <Menu
            mode="inline"
            defaultSelectedKeys={["1"]}
            defaultOpenKeys={["sub1"]}
            style={{
              height: "100%",
              backgroundColor: "#F1F2F6",
              color: "#414246",
              borderRight: "1px solid #EAEBEF",
            }}
            items={handlerRoutes(Object.values(routes))}
          />
        </Sider>
        <Layout style={{ padding: "0 24px 24px", backgroundColor: "#F1F2F6" }}>
          <Breadcrumb style={{ margin: "10px 0" }}>
            {/* <Breadcrumb.Item>Home</Breadcrumb.Item>
            <Breadcrumb.Item>List</Breadcrumb.Item>
            <Breadcrumb.Item>App</Breadcrumb.Item> */}
          </Breadcrumb>
          <Content
            style={{
              padding: 24,
              margin: 0,
              minHeight: 280,
              background: colorBgContainer,
              borderRadius: borderRadiusLG,
            }}
          >
            <Outlet />
          </Content>
        </Layout>
      </Layout>
    </Layout>
  );
};
