USE [dbgj_emplyee]
GO
/****** Object:  Table [dbo].[tb_guyuan]    Script Date: 12/15/2017 17:32:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_guyuan](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](30) NOT NULL,
	[xingshui] [money] NOT NULL,
	[shijian] [datetime] NOT NULL,
 CONSTRAINT [PK_tb_guyuan] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tb_emplyee]    Script Date: 12/15/2017 17:32:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_emplyee](
	[id] [tinyint] NOT NULL,
	[xinsui] [money] NULL,
	[bumeng] [varchar](1) NULL,
	[shijian] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF__tb_emplye__xinsu__014935CB]    Script Date: 12/15/2017 17:32:31 ******/
ALTER TABLE [dbo].[tb_emplyee] ADD  DEFAULT ((3000)) FOR [xinsui]
GO
