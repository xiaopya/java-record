import {useState} from 'react';
import type { ProColumns } from '@ant-design/pro-components';
import { ProTable } from '@ant-design/pro-components';
import {Button, Card, Space, Tag} from 'antd';
import {request} from "@umijs/max";
import Modal from '@/components/Modal';

type GithubIssueItem = {
    id: number;
    number: number;
    title: string;
    labels: {
        name: string;
        color: string;
    }[];
    state: string;
    comments: number;
    created_at: number;
    updated_at: number;
};

export default () => {

    const [modalState,setModalState] = useState({
        open: false,
        title: '',
        initialValue: undefined
    });

    const handlerOk = () => {

    }

    
const columns: ProColumns<GithubIssueItem>[] = [
    {
        title: '标题',
        dataIndex: 'name',
        width: '30%',
        hideInSearch: true,
    },
    {
        title: '创建时间',
        key: 'createTime',
        dataIndex: 'createTime',
        valueType: 'date',
        hideInSearch: true,
    },
    {
        title: '修改时间',
        key: 'updateTime',
        dataIndex: 'updateTime',
        valueType: 'date',
        hideInSearch: true,
    },
    {
        title: '操作',
        key: 'option',
        width: 120,
        valueType: 'option',
        render: () => [
          <a key="edit">编辑</a>,
          <a key="delete">删除</a>,
        ],
      },
];


    return (
            <>
            <Card>
                <ProTable<GithubIssueItem>
                    columns={columns}
                    request={async (params) => {
                       const res = await request('/api/dept/list', {
                            params,
                        });
                        if(res.code){
                            return {
                                success: true,
                                data: res.data
                            }
                        }
                       return [];
                    }}
                    rowKey="id"
                    search={false}
                    dateFormatter="string"
                    headerTitle=""
                    toolbar={{
                        actions: [
                            <Button
                                key="primary"
                                type="primary"
                                onClick={() => {
                                    setModalState((s)=>({
                                        ...s,
                                        open:true
                                    }))
                                }}
                            >
                                添加
                            </Button>,
                        ],
                    }}
                />
            </Card>
            {/* <Modal
                {...modalState}
                onOk={handlerOk}
            /> */}
            </>
    );
};